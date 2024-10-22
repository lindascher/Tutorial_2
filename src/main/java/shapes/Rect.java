package shapes;

import java.awt.*;

public class Rect extends Shape {
    private int width, height;

    // Constructor
    public Rect(int width, int height, Point position, Color color) {
        super(position, color);  // Calls the superclass constructor
        this.width = width;
        this.height = height;
    }

    // Override draw method to draw a rectangle
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, width, height);
    }
}
