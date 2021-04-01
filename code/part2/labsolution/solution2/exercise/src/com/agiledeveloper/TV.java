package com.agiledeveloper;

public class TV {
  private int volume = 1;

  public int getVolume() {
    return volume;
  }

  public void setVolume(int value) {
    volume = value;
  }

  public Remote getRemote() {
    return new Remote() {
      //we can keep view specific data in here if needed.

      @Override
      public void up() {
        setVolume(getVolume() + 1);
        //we can do special implementations here as needed for different views
      }

      @Override
      public void down() {
        setVolume(getVolume() - 1);
      }
    };
  }
}
