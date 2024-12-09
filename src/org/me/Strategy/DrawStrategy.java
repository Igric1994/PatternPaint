package org.me.Strategy;

import org.me.Paint;

import java.awt.event.MouseEvent;

public class DrawStrategy extends SpecificStrategy  {

    private DrawStrategy(Paint p) {
        super(p);
    }

    private static DrawStrategy singleStrategy;

    static DrawStrategy getState(Paint p){
        if (singleStrategy == null){
            singleStrategy = new DrawStrategy(p);
        }
        return singleStrategy;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    int x_start_click;
    int y_start_click;
    @Override
    public void mousePressed(MouseEvent e) {
        x_start_click = e.getX();
        y_start_click = e.getY();
    }

    private boolean mousePositionChanched(int x,  int y){
        return (x != x_start_click) || (y != y_start_click);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int finishX = e.getX();
        int finishY = e.getY();
        if (mousePositionChanched(finishX, finishY)){
            Pair pairX = new Pair(finishX, x_start_click);
            Pair pairY = new Pair(finishY, y_start_click);
            paint.createShape(
                        pairX.smaller,
                        pairY.smaller,
                        pairX.diff(),
                        pairY.diff());
        } else {
            paint.createShape(x_start_click, y_start_click);
        }
        paint.drawLast();
    }

    class Pair{
        int larger;
        int smaller;
        public Pair(int first, int second){
            if(first > second){
                larger = first;
                smaller = second;
            } else {
                larger = second;
                smaller = first;
            }
        }
        public int diff(){
            return larger - smaller;
        }
    }

    private boolean needRevers(int finishX, int finishY) {
        return (finishX < x_start_click) || (finishY < y_start_click);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
