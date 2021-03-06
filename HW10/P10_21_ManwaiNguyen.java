/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 31, 2017
  * Excercise: P10.21
  * Purpose: Draw a lot of houses on Frame
  * Input: N/A but can change variables to fit 
  * Outputs: Houses to frame
  * *******************************************/

import java.awt.*;
import javax.swing.*;


public class P10_21_ManwaiNguyen {  
  public static void main(String[] args) {   
    // frame to draw with
      JFrame frame = new JFrame();
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JComponent component = new JComponent()
      {
          public void paintComponent(Graphics house)
          {
            // initialize variables
            final int NHOUSES = 5, NCOLOR=3;
            int height=50, houseGap=50;
            int x=50, y;
            Color[] colors = {Color.magenta, Color.blue, Color.yellow, Color.black, Color.green, Color.red};
            Color color = colors[0];
            
            // draw houses
            for (int i=0; i<NHOUSES; i++) {
              y = 100 + (int)(Math.random() * 100 - 50); // random height
              height = 200 - y;               
              drawHouse(house, height, houseGap, x, y, color);
              x+=houseGap+5; // move house to right 
              color = colors[(int)(Math.random()*5)];
            }
          }
      };    
      
      frame.add(component);
      frame.setVisible(true);
   } 
   
  //@para graphics g
  //@return null
   public static void drawHouse(Graphics g, int height, int xGap, int x, int y, Color color) {
     final int NSIDES = 3, TRIHEIGHT = 25, TRIWIDTH = 25; 
     final int DOORX = 10, DOORY = 165, DOORW = 10, DOORH = 35;
     final int WINX = 10, WINY = 150, WINW = 10, WINH = 10;
       
     int[] xPoints = {x, x+TRIWIDTH, x+TRIWIDTH+TRIWIDTH};// triangle x coor
     int[] yPoints = {y, y-TRIHEIGHT, y}; // triangle y coor
     g.setColor(color); // color of whole house
     g.fillPolygon(xPoints, yPoints, NSIDES); // triangle
     g.drawRect(x, y, xGap, height); // house block
     g.drawRect(x+DOORX, DOORY, DOORH, DOORH); // door
     g.drawRect(x+WINX, WINY, WINW, WINH); // window
   }
}