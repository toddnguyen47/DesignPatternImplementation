package com.dependencyInjection.cars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dependencyInjection.Wheels;

public class MazdaCarTest {
  @Test
  public void testCarAccelerate() {
    // Arrange
    Wheels wheels = new Wheels();
    Car car = new MazdaCar(wheels);

    // Act
    String res = car.accelerate();

    // Assert
    assertEquals("Mazda Car is accelerating", res);
  }
}
