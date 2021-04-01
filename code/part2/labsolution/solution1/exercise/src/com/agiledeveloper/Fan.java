package com.agiledeveloper;

public class Fan implements Appliance {
  private int speed = 5;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int value) {
    speed = value;
  }

  @Override
  public void increase() {
    setSpeed(getSpeed() + 1);
  }

  @Override
  public void decrease() {
    setSpeed(getSpeed() - 1);
  }
}
