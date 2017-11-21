/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 31, 2017
  * Excercise: P10.18
  * Purpose: Frame to view Bull's eye
  * Input: N/A 
  * Outputs: Bull's eye on frame
  * *******************************************/
import javax.swing.*;

public class P10_18_ManwaiNguyenViewer {
  public static void main(String[] args) {
   // make frame to draw with
   JFrame frame = new JFrame();
   final int FRAME_WIDTH = 400;
   final int FRAME_HEIGHT = 400;
   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
   frame.setTitle("Bull's Eye");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JComponent component = new P10_18_ManwaiNguyenComponent();
   
   frame.add(component);   
   frame.setVisible(true);
  }
}