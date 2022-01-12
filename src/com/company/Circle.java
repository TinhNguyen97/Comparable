package com.company;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Vòng tròn có bán kính " + radius;
    }

    @Override
    public int compareTo(Circle o) {
        return (int) (radius - o.radius);
    }
}
