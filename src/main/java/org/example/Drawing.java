package org.example;

import shapes.Circle;
import shapes.Rect;
import shapes.Square;
import java.awt.*;

public class Drawing extends Canvas {
    private Circle circle;
    private Rect rect;
    private Square square;

    // Constructor initializing shapes
    public Drawing() {
        this.circle = new Circle(50, new Point(100, 100), Color.RED);
        this.rect = new Rect(120, 60, new Point(200, 100), Color.BLUE);
        this.square = new Square(50, new Point(100, 200), Color.GREEN);
    }

    // Override paint method to draw the shapes
    @Override
    public void paint(Graphics g) {
        circle.draw(g);   // Draw the circle
        rect.draw(g);     // Draw the rectangle
        square.draw(g);   // Draw the square
    }
}
