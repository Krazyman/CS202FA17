/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 31, 2017
  * Excercise: P10.18
  * Purpose: draw the bull's eye 
  * Input: N/A
  * Outputs: Bull's eye
  * *******************************************/
import java.awt.*;
import javax.swing.*;

public class P10_18_ManwaiNguyenComponent extends JComponent {
 
 /* @param g the drawing 
  * @return null
  * */
 public void paintComponent(Graphics g) {
  Graphics2D g2 = (Graphics2D) g;
  g2.setColor(Color.BLACK);
  g2.setStroke(new BasicStroke(20));
  g2.drawOval(111, 112, 175, 175);
  g2.drawOval(150, 150, 100, 100);
  g2.fillOval(175, 175, 50, 50);
 }
}