package com.agiledeveloper;

public class Garage {
  private boolean open;

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean state) {
    open = state;
  }

  public Remote getRemote() {
    return new Remote() {
      @Override
      public void up() {
        setOpen(true);
      }

      @Override
      public void down() {
        setOpen(false);
      }
    };
  }
}
