package org.example;

import java.awt.*;

class Drawing extends Canvas {

    public Drawing(int radius, int x, int y, Color color) {
        // Create a Point object using the x and y coordinates
        Point position = new Point(x, y);

        // Instantiate the Circle object using the provided values
        this.circle = new Circle(radius, position, color);

        // Set the canvas size and background color
        setSize(400, 400);    // Set the size of the canvas
        setBackground(Color.WHITE);  // Set the background color of the canvas
    }

    private Circle circle;

    @Override
    public void paint(Graphics g) {
        if (circle != null) {
            circle.draw(g);
        }
    }
}