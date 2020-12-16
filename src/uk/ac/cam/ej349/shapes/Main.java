package uk.ac.cam.ej349.shapes;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

abstract class Shape implements Drawable {
    @Override
    public abstract void draw();
}

interface Drawable {
    void draw();
}

public class Main {
    public static void main(String[] args) {
        // Without composite pattern
        List<Shape> shapes = new ArrayList<>(List.of(new Rectangle(), new Circle(), new Circle()));
        for (Shape shape : shapes) {
            shape.draw();
        }

        // With composite pattern - remember to use wildcards to capture covariance with generics
        Set s = new Set(shapes);
        s.draw();

        // Decorator pattern - adding a frame to each circle in the list
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                FramedShape newShape = new FramedShape(shape);
                newShape.draw();
            } else {
                shape.draw();
            }
        }

        // Decorator pattern with composite pattern
        Set s1 = new Set(new Circle(), new FramedShape(new Rectangle()), new Rectangle());
        s1.draw();
    }
}
