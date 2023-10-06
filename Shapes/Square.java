package Shapes;

public class Square extends Rectangle {

    public Square(double sideA) {
        if (sideA <= 0) {
            throw new RuntimeException("Error: side length of square must have positive value");
        }
        super.setHeight(sideA);
        super.setWidth(sideA);
    }

    @Override
    public double calcPerimeter() {
        return super.getHeight() * 4;
    }

    @Override
    public double calcArea() {
        return super.getHeight() * super.getWidth();
    }
    @Override
    public String getInfo() {
        return "Square with " +  super.getHeight() + " has area: " + calcArea() + " and perimeter: " + calcPerimeter();
    }
    
}
