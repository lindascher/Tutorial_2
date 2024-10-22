package org.example;

import java.awt.*;

public class Circle {
    private int radius;
    private Point position;
    private Color color;

    // Constructor to initialize the circle's properties
    public Circle(int radius, Point position, Color color) {
        this.radius = radius;
        this.position = position;
        this.color = color;
    }

    // Method to draw the circle
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);
    }
}
