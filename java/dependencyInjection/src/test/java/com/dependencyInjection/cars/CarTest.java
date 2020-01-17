package com.dependencyInjection.cars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dependencyInjection.Wheels;
import com.dependencyInjection.cars.Car;

public class CarTest {
  @Test
  public void testCarAccelerate() {
    // Arrange
    Wheels wheels = new Wheels();
    Car car = new Car(wheels);

    // Act
    String res = car.accelerate();

    // Assert
    assertEquals("Car is accelerating", res);
  }
}
