package com.agiledeveloper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
The code that was given is not extensible. The Remote class as given used tight coupling.
It is not extensible, without significant change, to accommodate yet amother appliance.

Some offered solution to create an Appliance interface. Others suggested creating a Remote
interface.

Solution2:
Let us explore the Remote interface approach because some people suggested that.

What is good about this approach?
If TV implements Remote, then we can only have one instance of Remote for each instance
of TV. In the current design, we can have multiple instances of Remote for a single
instance of TV. Each call to getRemote can create a new instance of Remote for us.

The Remote is extensible and it is an interface rather than a class. Loose coupling for the
users of Remote.

We are omt polluting the methods of TV or Fan with methods of a Remote directly.

The implementation of Remote can be different for each appliance.

Appliances are not required to conform to an arbitrary interface.

We can access the internals of the appliances and also provide view specific data in the
inner class implementations.

What may have to be improved?

There is no consistent way to get a remote from different appliances. It may be called
getRemote or something else.

This design looks very different than what we are used to, but that is not really that
uncommon as we may think.

Client ---> Remote        TV
              ^
              _
              |
              |----------- Internal Implementation of Remote within TV

Please see the 04_dip_in_java example.
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
