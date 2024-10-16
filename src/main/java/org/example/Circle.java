package org.example;

import java.awt.*;

public class Circle {
    private int radius;
    private Point position;
    private Color color;

    public Circle(int radius, Point position, Color color) {
        this.radius = radius;
        this.position = position;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);

        g.fillOval(position.x - radius, position.y - radius, radius*2, radius*2);
    }

}
