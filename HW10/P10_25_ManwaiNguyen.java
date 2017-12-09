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
import java.util.Arrays;
import java.util.Scanner;

public class P10_25_ManwaiNguyen {  
  public static void main(String[] args) {   
    // frame to draw with
    JFrame frame = new JFrame();
    final int FRAME_WIDTH = 400;
    final int FRAME_HEIGHT = 400;
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Color[] colors = new Color[3];
    int index = 0;
    String color;
    int way;
    String ask = "(black, blue, cyan, gray, green, yellow, magenta, orange, pink, red, white, darkgray, lightgray)";
    
    
    
    Scanner in = new Scanner(System.in);
    System.out.println("1 for vertical or 2 for horizontal: ");
    way = in.nextInt();
    for(int i=0; i<colors.length; i++) {
      System.out.println("Color: " + ask);
      color = in.next();
      colors[i] = colorCaller(color);
    }
    
    System.out.print(way);
    JComponent component = new JComponent() {
      public void paintComponent(Graphics Flag) {
        if (way == 1) {
          drawFlagV(Flag, 100, 100, colors[0], colors[1], colors[2]);
        } else if (way == 2) {
          drawFlagH(Flag, 100, 100, colors[0], colors[1], colors[2]);
        }
      }
    };
    
    frame.add(component);
    frame.setVisible(true);
    
    
  } 
  
  //@para graphics g
  //@return null
  public static void drawFlagH(Graphics g,int xLeft, int yTop, Color color1, Color color2, Color color3) { 
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
  
  public static void drawFlagV(Graphics g, int xLeft, int yTop, Color color1, Color color2, Color color3) {
    final int XGAP=20, WIDTH=60, HEIGHT = 90;
    g.setColor(Color.black);
    g.drawRect(xLeft-1, yTop-1, WIDTH+1, HEIGHT+1);
    g.setColor(color1);
    g.fillRect(xLeft, yTop, XGAP, HEIGHT);
    g.setColor(color2);
    g.fillRect(xLeft+XGAP, yTop, XGAP, HEIGHT);
    g.setColor(color3);
    g.fillRect(xLeft+XGAP+XGAP, yTop, XGAP, HEIGHT);
  }
  
  public static Color colorCaller(String color) {
    color = color.toLowerCase();
    switch(color) {
      case "black": return Color.black; 
      case "blue": return Color.blue; 
      case "cyan": return Color.cyan; 
      case "gray": return Color.gray; 
      case "green": return Color.green; 
      case "yellow": return Color.yellow; 
      case "magenta": return Color.magenta; 
      case "orange": return Color.orange; 
      case "pink": return Color.pink; 
      case "red": return Color.red; 
      case "white": return Color.white; 
      case "darkgray": return Color.darkGray; 
      case "lightgray": return Color.lightGray; 
    }
    return Color.white;
  }
}