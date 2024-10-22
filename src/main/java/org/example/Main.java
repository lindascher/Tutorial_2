package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Drawing Shapes");
        Drawing drawing = new Drawing();

        drawing.setSize(400, 400);
        drawing.setBackground(Color.WHITE);

        frame.add(drawing);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                frame.dispose();
            }
        });
    }
}
