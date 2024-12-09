package org.me.Shapes;

public class RectangleFactory extends ShapeFactory{
    @Override
    protected Shape createShape(int x, int y) {
        return new Rectangle(x, y);
    }

    @Override
    protected Shape createShape(int x, int y, int width, int height) {
        return new Rectangle(x, y, width, height);
    }
}
