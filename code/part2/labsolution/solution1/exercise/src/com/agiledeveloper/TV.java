package com.agiledeveloper;

public class TV implements Appliance {
  private int volume = 1;

  public int getVolume() {
    return volume;
  }

  public void setVolume(int value) {
    volume = value;
  }

  @Override
  public void increase() {
    setVolume(getVolume() + 1);
  }

  @Override
  public void decrease() {
    setVolume(getVolume() - 1);
  }
}
