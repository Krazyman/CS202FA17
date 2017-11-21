/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 31, 2017
  * Excercise: P10.26
  * Purpose: draw the olympic rings
  * Input: N/A
  * Outputs: olympic rings
  * *******************************************/
import java.awt.*;
import javax.swing.*;

public class P10_26_ManwaiNguyen {  
  public static void main(String[] args) {   
    // frame to draw with
      JFrame frame = new JFrame();
      final int FRAME_WIDTH = 1000;
      final int FRAME_HEIGHT = 1000;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JComponent component = new JComponent()
      {
          public void paintComponent(Graphics ring)
          {
            // initialize variables
            int x = 200, y =200;
            Color[] colors = {Color.magenta, Color.blue, Color.black, Color.red, Color.yellow, Color.green};
            
            for (int i=1; i<=3; i++) { // first row
              x += 110;
              drawRing(ring, x, y, colors[i]);
            }
            // move down
            x = 255;
            y += 50;
            
            for (int i=4; i<6; i++) { // second row
              x += 110;
              drawRing(ring, x, y, colors[i]);
            }
          }
      };      
      frame.add(component);
      frame.setVisible(true);
   } 
   
  //@para graphics g
  //@return null
   public static void drawRing(Graphics g, int x, int y, Color color) {  
     final int RADIUS = 100;
     
     Graphics2D g2 = (Graphics2D) g;
     g2.setColor(color);
     g2.setStroke(new BasicStroke(10));
     g2.drawOval(x, y, RADIUS, RADIUS);
   }
}