package com.dependencyInjection.cars;

import com.dependencyInjection.Wheels;

public class Car {
  protected Wheels wheels;
  protected String carBrand;
  public void setWheels(Wheels wheels) {this.wheels = wheels;}

  public Car(Wheels wheels) {
    this.wheels = wheels;
    this.carBrand = "Generic";
    System.out.println("I am in Car class");
  }

  public String accelerate() {
    System.out.println(wheels.roll());
    return "Car is accelerating";
  }

  public String getBrand() {
    return this.carBrand;
  }
}
