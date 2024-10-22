package shapes;

import java.awt.*;

public class Square extends Rect {

    // Constructor - simply passes the same size for width and height
    public Square(int size, Point position, Color color) {
        super(size, size, position, color);
    }
}
