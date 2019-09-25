package com.olenick.programmingCourse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class DimensionsTest {
    @Test
    public void testTwoFilledUpDimensionInstancesCanBeEqual() {
        assertEquals(new Dimensions(1.0, 2.0, 3.0), new Dimensions(1.0, 2.0, 3.0));
    }

    @Test
    public void testTwoNullifiedDimensionInstancesCanBeEqual() {
        assertEquals(new Dimensions(null, null, null), new Dimensions(null, null, null));
    }

    @Test
    public void testTwoPartiallyFilledUpDimensionInstancesCanBeEqual() {
        assertEquals(new Dimensions(1.0, null, 3.0), new Dimensions(1.0, null, 3.0));
    }

    @Test
    public void testDimensionsAreNotPermutable() {
        assertNotEquals(new Dimensions(3.0, 2.0, 1.0), new Dimensions(1.0, 2.0, 3.0));
    }

    @Test
    public void testFilledUpDimensionsCanBeConvertedToString() {
        assertEquals("1.0 x 2.0 x 3.0", new Dimensions(1.0, 2.0, 3.0).toString());
    }

    @Test
    public void testNullifiedDimensionsCanBeConvertedToString() {
        assertEquals("null x null x null", new Dimensions(null, null, null).toString());
    }

    @Test
    public void testPartiallyFilledUpDimensionsCanBeConvertedToString() {
        assertEquals("null x 2.0 x null", new Dimensions(null, 2.0, null).toString());
    }
}
