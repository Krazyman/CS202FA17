/********************************
  * Program Title: ManwaiNQ5.java
  * Purpose:draws a handsome face
  * Date: 9/25/17
  * Input: N/A
  * Output: a face
  * *******************************/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class ManwaiNQ5 {  
  public static void main(String[] args) {   
    // frame to draw with
      JFrame frame = new JFrame();
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JComponent component = new JComponent()
      {
          public void paintComponent(Graphics graph)
          {
              draw(graph);
          }
      };      
      frame.add(component);
      frame.setVisible(true);
   } 
   
  //@para graphics g
  //@return null
   public static void draw(Graphics g) {  
     g.drawOval(84, 64, 200, 250); // head
     g.drawOval(116, 128, 50, 50); // left eye
     g.drawOval(200, 128, 50, 50); // right eye
     g.fillOval(140, 152, 10, 10); // left eyeball
     g.fillOval(224, 152, 10, 10); // right eyeball
     g.drawLine(180, 190, 200, 212); // nose top
     g.drawLine(200, 212, 185, 212); // nose bottom
     g.drawLine(130, 110, 170, 120); // left eye brow
     g.drawLine(214, 120, 254, 110); // right eye brow
     g.drawLine(130, 240, 230, 240); // top mouth
     g.drawArc(130 ,220, 100, 40, 180, 180); // bottom mouth
     g.drawArc(70, 180, 25, 50, 90, 210); // left ear
     g.drawArc(272, 180, 25, 50, -120, 210); // right ear
     g.fillArc(140, 64, 90, 25, 45, 360); // hair
     for (int i=175; i<232; i+=2) { // hair flap
       g.drawArc(i, 70, 50, 25, -90, 360);
     }
     g.drawLine(137, 250, 223, 250); // teeth
   }
}