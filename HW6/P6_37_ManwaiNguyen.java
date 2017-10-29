/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 9, 2017
  * Excercise: P6.37
  * Purpose: Draw a 8x8 checker board
  * Input: N/A
  * Outputs: checker board on frame
  * *******************************************/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class P6_37_ManwaiNguyen {
  public static void main(String[] args) {   
    // frame to draw with
      JFrame frame = new JFrame();
      final int FRAME_WIDTH = 180;
      final int FRAME_HEIGHT = 200;
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
  
  /*
   * @param g Graphics
   * */
  public static void draw(Graphics g) {
    final int width = 20;
    g.setColor(Color.BLACK);

    // Top row. Note that the top left corner of the drawing has coordinates (0, 0)
    int x = 0;
    int y = 0;
    // 8 rows
    for (int j=0; j<8; j++) {
      // move down
      y = width * j;
      // 8 columns 
      for (int i = 0; i < 4; i++) {
        g.fillRect(x, y, width, width);
        x = x + 2 * width;
      }
      // start with black or white
      if (j%2==0) {
        x = width;
      } else {
        x = 0;
      }
    }  
  }
}