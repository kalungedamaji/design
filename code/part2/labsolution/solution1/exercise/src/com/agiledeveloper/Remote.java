package com.agiledeveloper;

public class Remote {
  private Appliance appliance;

  public Remote(Appliance theAppliance) {
    appliance = theAppliance;
  }

  public void up() {
    appliance.increase();
  }

  public void down() {
    appliance.decrease();
  }
}