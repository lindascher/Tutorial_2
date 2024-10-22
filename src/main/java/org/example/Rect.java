package org.example;

import java.awt.*;

public class Rect {
    private int width, height;
    private Point position;
    private Color color;

    // Constructor to initialize the rectangle's properties
    public Rect(int width, int height, Point position, Color color) {
        this.width = width;
        this.height = height;
        this.position = position;
        this.color = color;
    }

    // Method to draw the rectangle
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, width, height);
    }
}
