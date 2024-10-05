
package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Get height
    public double getHeight() {
        return height;
    }

    // Calculate volume
    public double getVolume() {
        return getArea() * height;
    }
}

