/********************************
  * Program Title: ManwaiNQ5.java
  * Purpose: Draw the clock with the right time displayed as requested
  * Date: 11/3/17
  * Input: hours and minute
  * Output: clock with correct time
  * *******************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManwaiNQ5Component extends JComponent {
  
   // initialize variables
   private double hours;
   private double minute;
   private final int CENTER_X = 175, CENTER_Y = 175;
   private final int RADIUS = 650;
   private final double MIN_PER_HOUR = 60;

   // just to make it so that the frame can call on this component
   public ManwaiNQ5Component() {
     
   }
   
   /* purpose of method: determine how many which 12hr time to go to
    * @param hour where the hour hand should be
    * @param min where the minute hand should be
    * */
   public void time(int hour, int min) {
    if (hour>12) {
      hours = hour -12; 
     } else {
     hours = hour;
     }
      minute = min;
      repaint();
   }

   /* purpose of method: draw the clock on frame
    * @param g the drawing component
    * */
   public void paintComponent(Graphics g) {
     Graphics2D g2 = (Graphics2D) g;
     Color black = new Color(0, 0, 0);
     g2.setStroke(new BasicStroke(10));
     g.setColor(black);
     g2.drawOval(CENTER_X, CENTER_Y, RADIUS, RADIUS); // draw frame of clock

     /* had to use a modified angle because the method I chose to approach this problem was
      * different and so I had to rotate my clock by that angle
      * */
     double angle = 10*Math.PI/6;
     for (int i=1; i<=12; i++) { // draw the numbers of the clock on to frame
      int x = (int) Math.round(300 * Math.cos(angle)); // using the unit circle method
      int y = (int) Math.round(300 * Math.sin(angle));
      String num = String.format("%s", i);
      g.drawString(num, x+500, y+500); // the 500 values is just to draw to center of view
      angle += Math.PI/6;
     }
     
     /*hour angle would be 30 degrees times the hour + amount of minutes before the next hour
      * usually that would be the hour calculation but since I rotated my clock when I drew it
      * I had to compensate for it by adding the angle I rotated.
      * Minute was the same thing
      * */
     double hourAngle = (hours*Math.PI/6) + (minute/MIN_PER_HOUR*Math.PI/6) + (9*Math.PI/6);
     double minAngle = (minute/MIN_PER_HOUR*2*Math.PI) + (9*Math.PI/6);
     int hourX = (int) Math.round(200 * Math.cos(hourAngle));
     int hourY = (int) Math.round(200 * Math.sin(hourAngle));
     int minX = (int) Math.round(300 * Math.cos(minAngle));
     int minY = (int) Math.round(300 * Math.sin(minAngle));
     // the magic numbers are just so that it would draw on screen
     g.drawLine(CENTER_X+325, CENTER_Y+325, hourX+500, hourY+500); 
     g.setColor(Color.red);
     g.drawLine(CENTER_X+325, CENTER_Y+325, minX+500, minY+500);
     repaint();
   }
 }