package org.me.Shapes;

import java.awt.*;

public abstract class Shape {
    int posX;
    int posY;
    int baseWidth = 100;
    int baseHeight = 100;
    int width;
    int height;

    public Shape(int x, int y){
        posX = x;
        posY = y;
        width = baseWidth;
        height = baseHeight;
    }

    public Shape(int x, int y, int width, int height){
        posX = x;
        posY = y;
        this.width = width;
        this.height = height;
    }

    public abstract void draw(Graphics2D g, int width, int height);
    public abstract void draw(Graphics2D g);
}
