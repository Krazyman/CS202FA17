/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 31, 2017
  * Excercise: P10.25
  * Purpose: draw any 3 horizontal color flag
  * Input: 3 colors (must change variables)
  * Outputs: 3 color flag on frame
  * *******************************************/
import java.awt.*;
import javax.swing.*;

public class P10_25_ManwaiNguyen {  
  public static void main(String[] args) {   
    // frame to draw with
      JFrame frame = new JFrame();
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JComponent component = new JComponent()
      {
          public void paintComponent(Graphics Flag)
          {
              drawFlag(Flag, 100, 100, Color.black, Color.red, Color.yellow);
              drawFlag(Flag, 200, 200, Color.red, Color.white, Color.green);
          }
      };      
      frame.add(component);
      frame.setVisible(true);
   } 
   
  //@para graphics g
  //@return null
   public static void drawFlag(Graphics g,int xLeft, int yTop, Color color1, Color color2, Color color3) { 
     final int YGAP = 20, WIDTH = 90, HEIGHT=60;
     g.setColor(Color.black);
     g.drawRect(xLeft-1, yTop-1, WIDTH+1, HEIGHT+1);
     g.setColor(color1);
     g.fillRect(xLeft, yTop, WIDTH, YGAP);
     g.setColor(color2);
     g.fillRect(xLeft, yTop+YGAP, WIDTH, YGAP);
     g.setColor(color3);
     g.fillRect(xLeft, yTop+YGAP+YGAP, WIDTH, YGAP);
   }
}