import Interfaces.Figure;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

       List<Figure> figures = new ArrayList<>();

       try {
           figures.add(new Triangle(3, 4, 5));
       } catch (RuntimeException e) {
           System.out.println(e.getMessage());
       }

        try {
            figures.add(new Triangle(4, 5, 7));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            figures.add(new Triangle(1, 2, 3));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
         try {
            figures.add(new Circle(5));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

         try {
           figures.add(new Rectangle(5,2));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
           figures.add(new Square(6));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        for (Figure item: figures) {
            System.out.println(item.getInfo());
        }

    }
}