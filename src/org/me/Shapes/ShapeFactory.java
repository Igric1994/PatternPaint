package org.me.Shapes;

public abstract class ShapeFactory {
    public Shape create(int x, int y){
        return createShape( x,  y);
    }

    public Shape create(int x, int y, int width, int height){
        return createShape( x,  y,  width,  height);
    }

    protected abstract Shape createShape(int x, int y);
    protected abstract Shape createShape(int x, int y, int width, int height);
}
