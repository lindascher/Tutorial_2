package shapes;

import java.awt.*;

public abstract class Shape {
    protected Point position;
    protected Color color;

    // Constructor for common properties
    public Shape(Point position, Color color) {
        this.position = position;
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    public abstract void draw(Graphics g);
}
