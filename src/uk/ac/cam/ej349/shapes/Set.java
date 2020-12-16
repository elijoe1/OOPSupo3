package uk.ac.cam.ej349.shapes;

import java.util.Arrays;
import java.util.List;

public class Set implements Drawable {
    private final List<Drawable> items;

    public Set(Drawable... items) {
        this.items = List.copyOf(Arrays.asList(items));
    }

    public Set(List<? extends Drawable> items) {
        this.items = List.copyOf(items);
    }

    @Override
    public void draw() {
        for (Drawable item : items) {
            item.draw();
        }
    }
}
