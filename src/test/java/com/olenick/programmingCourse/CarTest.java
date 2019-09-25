package com.olenick.programmingCourse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testACarIsACarWithAName() {
        Car car = new Car("General Lee");
        assertEquals("car 'General Lee'", car.toString());
}

    @Test
    public void testACarVehicleIsACarWithAName() {
        Vehicle car = new Car("General Lee");
        assertEquals("car 'General Lee'", car.toString());
    }

    @Test
    public void testCarDimensionsAreMeaningful() {
        Car car = new Car("General Lee");
        assertEquals(new Dimensions(3.0, 1.5, 4.5), car.getDimensions());
    }

    @Test
    public void testCarVehicleDimensionsAreMeaningful() {
        Vehicle car = new Car("General Lee");
        assertEquals(new Dimensions(3.0, 1.5, 4.5), car.getDimensions());
    }
}
