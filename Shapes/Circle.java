package Shapes;

import Interfaces.Figure;

public class Circle extends Figure {
    
    private double radius;
    
    public Circle(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Error: radius must have positive value");
        }
        this.radius = radius;
    }

    @Override
    public double calcCircleLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public double calcPerimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcPerimeter'");
    }

    @Override
    public String getInfo() {
        return "Circle radius " + radius  + " has area: " + calcArea() + " and circle length: " + calcCircleLength();
    }
    
}