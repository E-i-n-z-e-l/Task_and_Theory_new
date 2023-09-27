package ArkhitekturaPO.Practical_3.OCP;

import java.util.ArrayList;
import java.util.List;

class ShapeDrawer {
    private List<Shape> shapes;

    public ShapeDrawer() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAllShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
