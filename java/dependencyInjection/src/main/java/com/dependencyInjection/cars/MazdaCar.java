package com.dependencyInjection.cars;

import com.dependencyInjection.Wheels;

public class MazdaCar extends Car {

  public MazdaCar(Wheels wheels) {
    super(wheels);
    this.carBrand = "Mazda";
    System.out.println("I am in Mazda Car");
  }

  @Override
  public String accelerate() {
    this.wheels.roll();
    return "Mazda Car is accelerating";
  }
}
