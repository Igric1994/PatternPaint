package org.me.Shapes;

public class EllipseFactory extends ShapeFactory{

    @Override
    protected Shape createShape(int x, int y) {
        return new Ellipse(x, y);
    }

    @Override
    protected Shape createShape(int x, int y, int width, int height) {
        return new Ellipse(x, y, width, height);
    }
}
