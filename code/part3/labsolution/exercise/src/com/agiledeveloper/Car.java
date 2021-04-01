package com.agiledeveloper;

public class Car {
  private final int year; //please keep this final
  private final Engine engine; //please keep this final

  public Car(int theYear, Engine theEngine) {
    year = theYear;
    engine = theEngine;
  }

  protected Car(Car other) {
    year = other.year;
    engine = other.engine.clone();
  }

  public static Car copyCar(Car car) {
    return new Car(car);
  }

  public int getYear() { return year; }
  public Engine getEngine() { return engine; }
}