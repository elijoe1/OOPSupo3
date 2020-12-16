package uk.ac.cam.ej349.shapes;

public class FramedShape implements Drawable {

    private Shape shape;

    public FramedShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        System.out.println("Adding a frame to the shape below:");
        shape.draw();
    }
}
