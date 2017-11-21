/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 31, 2017
  * Excercise: P10.23
  * Purpose: Draw a 3D cylinder
  * Input: N/A
  * Outputs: 3D cylinder on frame
  * *******************************************/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class P10_23_ManwaiNguyen {  
  public static void main(String[] args) {   
    // frame to draw with
      JFrame frame = new JFrame();
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JComponent component = new JComponent()
      {
          public void paintComponent(Graphics cylinder)
          {
              draw(cylinder);
          }
      };      
      frame.add(component);
      frame.setVisible(true);
   } 
   
  //@para graphics g
  //@return null
   public static void draw(Graphics g) {  
    // to draw a cylinder
    Color purple = new Color(255, 0, 255);
    g.setColor(purple.darker().darker());
    g.fillRect(50,80,100,120); // body of cylinder
    g.fillOval(49, 61, 102, 50); // top of cylinder
    g.fillOval(49,175,101,50); // bottom of cylinder
    g.setColor(Color.white);
    g.drawOval(50,60,100,50); // the top side of cylinder
   }
}