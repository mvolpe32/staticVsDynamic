package com.olenick.programmingCourse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuadricycleTest {
    @Test
    public void testAQuadricycleIsAQuadricycleWithAName() {
        Quadricycle quad = new Quadricycle("General Lee");
        assertEquals("quadricycle 'General Lee'", quad.toString());
    }

    @Test
    public void testAQuadricycleVehicleIsAQuadricycleWithAName() {
        Vehicle quad = new Quadricycle("General Lee");
        assertEquals("quadricycle 'General Lee'", quad.toString());
    }

    @Test
    public void testQuadricycleDimensionsAreMeaningful() {
        Quadricycle quad = new Quadricycle("General Lee");
        assertEquals(new Dimensions(2.0, 1.0, 3.0), quad.getDimensions());
    }

    @Test
    public void testQuadricycleVehicleDimensionsAreMeaningful() {
        Vehicle quad = new Quadricycle("General Lee");
        assertEquals(new Dimensions(2.0, 1.0, 3.0), quad.getDimensions());
    }
}
