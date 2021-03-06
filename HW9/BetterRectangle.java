/* Creates a Rectangel that has an x, y, width, height */

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        this.setLocation(x, y);
        this.setSize(width, height);        
    }

    public double getPerimeter() {
        return 2 * super.getHeight() + 2 * super.getWidth();
    }

    public double getArea() {
        return super.getHeight() * super.getWidth();
    }
}