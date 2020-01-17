package com.dependencyInjection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dependencyInjection.cars.Car;
import com.dependencyInjection.cars.MazdaCar;

public class DriverTest {
  @Test
  public void driveTest_GenericCar() {
    // Arrange
    Wheels wheels = new Wheels();
    Car car = new Car(wheels);
    Driver driver = new Driver();
    driver.setCar(car);

    // Act
    String res = driver.drive();
    
    // Assert
    assertEquals("Generic", driver.getCarBrand());
    assertEquals("I am driving", res);
  }

  @Test
  public void driveAMazda() {
    // Arrange
    Wheels wheels = new Wheels();
    Car mazdaCar = new MazdaCar(wheels);
    Driver driver = new Driver();
    driver.setCar(mazdaCar);

    // Act
    String res = driver.drive();

    // Assert
    assertEquals("Mazda", driver.getCarBrand());
    assertEquals("I am driving", res);
  }
}
