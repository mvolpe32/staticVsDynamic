package com.olenick.programmingCourse;

/**
 * This is the Car class.
 */
public class Car extends Vehicle {
    protected static Double getWidth() { return 3.0; }
    protected static Double getHeight() { return 1.5; }
    protected static Double getLength() { return 4.5; }
    protected String getTypeAsString() { return "car"; }

    /**
     * This returns the dimensions of a car.
     * @return Dimensions of the car.
     */
    public static Dimensions getDimensions() {
        return new Dimensions(getWidth(), getHeight(), getLength());
    }

    protected final String name;

    /**
     * Car constructor.
     * @param name Name of the car, not the brand.
     */
    public Car(String name) {
        this.name = name;
    }

    protected String getName() { return name; }
}
