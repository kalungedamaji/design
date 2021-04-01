package com.agiledeveloper;

public class Fan {
  private int speed = 5;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int value) {
    speed = value;
  }

  public Remote getRemote() {
    return new Remote() {
      @Override
      public void up() {
        setSpeed(getSpeed() + 1);
      }

      @Override
      public void down() {
        setSpeed(getSpeed() - 1);
      }
    };
  }
}
