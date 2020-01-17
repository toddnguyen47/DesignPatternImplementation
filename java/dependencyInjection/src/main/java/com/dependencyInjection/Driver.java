package com.dependencyInjection;

import com.dependencyInjection.cars.Car;

public class Driver {
  private Car car = null;

  public Driver() {
    System.out.println("I am in Driver");
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public String drive() {
    System.out.println(this.car.accelerate());
    return "I am driving";
  }

  public String getCarBrand() {
    return this.car.getBrand();
  }
}
