/* Creates a LabeledPoint that consist of an x, y, and label */

public class LabeledPoint {

    private double x;
    private double y;
    private String label;

    public LabeledPoint(int x, int y, String l) {
        x = x;
        y = y;
        label = l;
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }
    
    public void setX(double x) {
       x = x;
    }
    
    public void setY(double y) {
       y = y;
    }

    public void setLabel(String l) {
       label = l;
    }

    public String toString() {
      String info = String.format("x: %f, y: %f, Label: %s", x, y, label);
      return info;
    }
}