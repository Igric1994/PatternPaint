package org.me.Strategy;

import org.me.Paint;

import java.awt.event.MouseEvent;

public class SelectedStrategy extends SpecificStrategy {

    private static SelectedStrategy singleStrategy;

    static SpecificStrategy getState(Paint paint){
        if (singleStrategy == null){
            singleStrategy = new SelectedStrategy(paint);
        }
        return singleStrategy;
    }

    private SelectedStrategy(Paint p) {
        super(p);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Select");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
