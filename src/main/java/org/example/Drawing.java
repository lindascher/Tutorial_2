package org.example;

import java.awt.*;

public class Drawing extends Canvas {
    private Circle circle;

    // Constructor initializes the circle
    public Drawing() {
        this.circle = new Circle(50, new Point(150, 150), Color.RED);
    }

    // Override the paint method to draw shapes
    public void paint(Graphics g) {
        circle.draw(g);  // Draw the circle
    }
}
