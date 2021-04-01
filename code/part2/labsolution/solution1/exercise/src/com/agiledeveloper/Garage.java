package com.agiledeveloper;

public class Garage implements Appliance {
  private boolean open;

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean state) {
    open = state;
  }

  @Override
  public void increase() {
    setOpen(true);
  }

  @Override
  public void decrease() {
    setOpen(false);
  }
}
