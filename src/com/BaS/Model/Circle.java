package com.BaS.Model;

public class Circle {
    public double getDiameter() {
        return diameter;
    }

    private void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getSquare() {
        return square;
    }

    private void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    private double diameter;
    private double square;
    private double perimeter;

    public Circle(double radius) {

        setDiameter(radius * 2);
        setPerimeter(2 * Math.PI * radius);
        setSquare(Math.PI * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "diameter: " + diameter +
                "; square: " +
                square +
                "; perimeter: " +
                perimeter +
                ';';
    }
}
