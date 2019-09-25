package com.olenick.programmingCourse;

public abstract class Vehicle {
    protected Double getWidth() { return 3.0; };
    protected Double getHeight() { return 1.5; };
    protected Double getLength() { return 4.5; };
    protected String getTypeAsString() { return "vehicle"; }

    public Dimensions getDimensions() {
        return new Dimensions(getWidth(), getHeight(), getLength());
    }

    protected abstract String getName();

    public String toString() {
        return "" + getTypeAsString() + " '" + getName() + "'";
    }
}
