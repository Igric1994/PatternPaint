package org.me.Strategy;



import org.me.Paint;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class SpecificStrategy implements MouseListener {
    protected SpecificStrategy(Paint p){
        paint = p;
    }

    protected Paint paint;

    @Override
    public abstract void mouseClicked(MouseEvent e) ;

    @Override
    public abstract void mousePressed(MouseEvent e) ;

    @Override
    public abstract void mouseReleased(MouseEvent e);

    @Override
    public abstract void mouseEntered(MouseEvent e) ;

    @Override
    public abstract void mouseExited(MouseEvent e);
}
