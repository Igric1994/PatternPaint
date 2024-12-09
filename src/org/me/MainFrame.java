package org.me;

import javax.swing.*;

public class MainFrame extends JFrame {

    Paint paint;

    public MainFrame(){
        setTitle("Paint");
        paint = new Paint();
        add(paint.root);
//        paint.canvas.add(new Main());
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // Sets the window to fit the natural size of its content pane
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new MainFrame();
    }
}
