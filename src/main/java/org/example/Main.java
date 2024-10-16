package org.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Frame object (window)
        Frame frame = new Frame("AWT Drawing Program");

        // Step 2: Create an instance of the Drawing class (which extends Canvas)
        Drawing drawing = new Drawing(75, 150, 150, Color.RED);

        drawing.setSize(300, 300);

        drawing.setBackground(Color.WHITE);

        // Step 3: Add the Drawing object to the Frame using the add() method
        frame.add(drawing);  // This attaches the Canvas (Drawing) to the Frame

        // Step 4: Make the Frame visible
        frame.setVisible(true);

        frame.setLayout(null);

        frame.setSize(300, 300);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}