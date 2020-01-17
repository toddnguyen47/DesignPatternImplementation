package com.dependencyInjection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WheelsTest {
  @Test
  public void testWheelsPrint() {
    // Arrange
    Wheels wheels = new Wheels();

    // Act
    String result = wheels.roll();

    // Assert
    assertEquals("wheels", result);
  }
}
