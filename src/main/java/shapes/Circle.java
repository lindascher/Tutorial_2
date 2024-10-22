package shapes;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(int radius, Point position, Color color) {
        super(position, color);  // Calls the superclass constructor
        this.radius = radius;
    }

    // Override draw method to draw a circle
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);
    }
}
