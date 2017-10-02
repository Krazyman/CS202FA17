/*******************************************
  * Name: Manwai Nguyen
  * Date: Sep 24, 2017
  * Excercise: P4.21
  * Purpose: print asterisk diamond 
  * Input: side length of diamond
  * Outputs: asterisk diamond
  * *******************************************/

import java.util.Scanner;

public class P4_21_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please input the side length you want your diamond asterisk: ");
    int side = in.nextInt();
    
    int spaces=0, stars=0;
    // top part of diamond
    for (int i=1; i<side+1; i++) { 
      spaces = side - i; // number of spaces 
      stars = 2*i -1; // number of stars
      for (int j=1; j<=spaces; j++) { // print spaces
       System.out.print(" "); 
      }
      for (int k=1; k<=stars; k++) { // print stars
       System.out.print("*"); 
      }
      for (int l=1; l<=spaces; l++) { // print spaces
       System.out.print(" "); 
      }
      System.out.println(); // next line
    }
    
    // bottom part of diamond
    for (int i=side-1; i>0; i--) { 
      spaces = side - i;
      stars = 2*i -1;
      for (int j=1; j<=spaces; j++) { // print spaces
       System.out.print(" "); 
      }
      for (int k=1; k<=stars; k++) { // print stars
       System.out.print("*"); 
      }
      for (int l=1; l<=spaces; l++) { // print spaces
       System.out.print(" "); 
      }
      System.out.println(); // next line
    }
    in.close();
  }
}
