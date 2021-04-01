package com.agiledeveloper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
The code that was given is not extensible. The Remote class as given used tight coupling.
It is not extensible, without significant change, to accommodate yet amother appliance.

Some offered solution to create an Appliance interface. Others suggested creating a Remote
interface.

Solution1:
Let us explore the Appliance interface approach because more people suggested that.

   ---------------------------->
   |
RemoteFactory ---> Remote  ----> Appliance
                                     ^
                                     |
                                     |
                               ----------------------------------
                               |     |       |
                              TV    Fan   Garage ....

This approach is a very straightforward application of DIP.

What is good about this design?
The Remote is extensible
There is a consistent use of remote to access different appliances.
We can have multiple remote instances for the same appliance. Two remotes for one TV is possible.

What may be improved from this design?
The TV, Fan, Garage, etc. are now forced to conform to an arbitrary interface called Appliance,
so as to be used with a Remote.
Methods of the appliances are public methods of TV, Fan, etc. which may not be desirable.
We can't really leverage any special implementation details that may be necessary to
implement a particular view internally in the classes. For example, one Remote instance
may need some direct access to the internals of a TV, but that is hard to provide in the
current design.
*/

public class RemoteTest {
  @Test
  void canary() {
    assertTrue(true);
  }

  @Test
  void remoteIncreaseVolumeOfATV() {
    TV tv = new TV();
    Remote remote = RemoteFactory.createRemoteForTV(tv);

    int volume = tv.getVolume();
    remote.up();

    assertEquals(1, volume);
    assertEquals(2, tv.getVolume());
  }

  @Test
  void remoteDecreaseVolumeOfATV() {
    TV tv = new TV();
    Remote remote = RemoteFactory.createRemoteForTV(tv);

    int volume = tv.getVolume();
    remote.down();

    assertEquals(1, volume);
    assertEquals(0, tv.getVolume());
  }

  @Test
  void remoteIncreaseSpeedOfAFan() {
    Fan fan = new Fan();
    Remote remote = RemoteFactory.createRemoteForFan(fan);

    int speed = fan.getSpeed();
    remote.up();

    assertEquals(5, speed);
    assertEquals(6, fan.getSpeed());
  }

  @Test
  void remoteDecreaseSpeedOfAFan() {
    Fan fan = new Fan();
    Remote remote = RemoteFactory.createRemoteForFan(fan);

    int speed = fan.getSpeed();
    remote.down();

    assertEquals(5, speed);
    assertEquals(4, fan.getSpeed());
  }

  void remoteOpenGarage() {
    Garage garage = new Garage();
    Remote remote = RemoteFactory.createRemoteForGarage(garage);

    boolean open = garage.isOpen();
    remote.up();

    assertFalse(open);
    assertTrue(garage.isOpen());

    remote.down();
    assertFalse(garage.isOpen());
  }
}
