/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 20, 2017
  * Excercise: P9.10
  * Purpose: Creates a rectangle and it also allows you to get the perimeter and area of it
  * Input: N/A
  * Outputs: Rectangles coordinates and size
  * *******************************************/

public class P9_10_ManwaiNguyen {  
  public static void main(String[] args) { 
    BetterRectangle box = new BetterRectangle(0, 0, 6, 4);
    System.out.println("The perimeter of the box is " + box.getPerimeter());
    System.out.println("The area of the box is " + box.getArea());
    
  }
}