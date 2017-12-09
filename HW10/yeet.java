import java.util.Scanner;
import java.awt.Color;

public class yeet {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    System.out.println("color: ");
    String color = in.next();
    Color colors;
    color = color.toLowerCase();
    switch(color) {
      case "black": colors = Color.black; break; 
      case "blue": colors = Color.blue; break; 
      case "cyan": colors = Color.cyan; break; 
      case "gray": colors = Color.gray; break; 
      case "green": colors = Color.green; break; 
      case "yellow": colors = Color.yellow; break; 
      case "magenta": colors = Color.magenta; break; 
      case "orange": colors = Color.orange; break; 
      case "pink": colors = Color.pink; break; 
      case "red": colors = Color.red; break; 
      case "white": colors = Color.white; break; 
      case "darkgray": colors = Color.darkGray; break; 
      case "lightgray": colors = Color.lightGray; break; 
    }
    System.out.println(color);
  }
}