package org.me.Shapes;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(int x, int y) {
        super(x, y);
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int width,  int height) {
        g.drawRect(posX, posY, width, height);
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawRect(posX, posY, width, height);
    }

}
