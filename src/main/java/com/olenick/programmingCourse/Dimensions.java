package com.olenick.programmingCourse;

public class Dimensions {
    private Double height;
    private Double length;
    private Double width;

    public Dimensions(Double width, Double height, Double length) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "" + width + " x " + height + " x " + length;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Dimensions) {
            Dimensions another = (Dimensions)other;
            result =
                ((this.height == null && another.height == null) || this.height.equals(another.height)) &&
                ((this.length == null && another.length == null) || this.length.equals(another.length)) &&
                ((this.width == null && another.width == null) || this.width.equals(another.width));
        }
        return result;
    }
}
