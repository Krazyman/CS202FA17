/*******************************************
  * Name: Manwai Nguyen
  * DateL Sep 11, 2017
  * Excercise: P3.42
  * Purpose: Determine if the rope will break or not
  * Input: rotation speed
  * Outputs: if the rope breaks or not
  * *******************************************/

import java.util.Scanner;

public class P3_42_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    final double MASS = 2, LENGTH = 3, MAXTENSION = 60; // constant
    System.out.print("Please input the rotation speed: ");
    while (!in.hasNextDouble()) {
      System.out.print("Please input the rotation speed: ");
      in.next();
    }
    double speed = in.nextDouble();
    double tension = MASS*speed*speed/LENGTH; // calculate tension
    
    // see if rope breaks or not
    if (tension>MAXTENSION) {
      System.out.println("The rope will break!");
    } else { 
      System.out.println("The rope will not break!");
    }
  }
}