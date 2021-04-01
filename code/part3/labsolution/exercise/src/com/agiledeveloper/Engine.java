package com.agiledeveloper;

abstract public class Engine {
  public Engine() {}
  protected Engine(Engine other) {}

  abstract public Engine clone();
}
