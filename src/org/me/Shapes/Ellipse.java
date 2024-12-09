package org.me.Shapes;

import java.awt.*;

public class Ellipse extends Shape {
    public Ellipse(int x, int y) {
        super(x, y);
    }

    public Ellipse(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        g.drawOval(posX, posY, width, height);
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawOval(posX, posY, width, height);
    }
}
