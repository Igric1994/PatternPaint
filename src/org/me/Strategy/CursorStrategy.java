package org.me.Strategy;


import org.me.Paint;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class CursorStrategy implements MouseListener {
    MouseListener currentState;

    public Paint paint;

    public CursorStrategy(Paint p){
        paint = p;
    }

    public void changeState(CursorStrategies newState){
        switch (newState){
            case CursorStrategies.SELECT -> currentState = SelectedStrategy.getState(paint);
            case CursorStrategies.DRAW -> currentState = DrawStrategy.getState(paint);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        currentState.mouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        currentState.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        currentState.mouseReleased(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        currentState.mouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        currentState.mouseExited(e);
    }
}
