package Shapes;

import Interfaces.Figure;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws RuntimeException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new RuntimeException("Error: all side length of triangle must have positive value");
        }

        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA)) {
            throw new RuntimeException("Error: triangle with entered side length can't be created");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double halfPerimeter = calcPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) *  (halfPerimeter - sideB) *  (halfPerimeter - sideC));
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getInfo() {
        return "Triangle with " + sideA  + ", " + sideB + ", " + sideC + " has area: " + calcArea() + " and perimeter: " + calcPerimeter();
    }

    @Override
    public double calcCircleLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcCircleLength'");
    }
}
