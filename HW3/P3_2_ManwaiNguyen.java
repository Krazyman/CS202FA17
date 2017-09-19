/*******************************************
  * Name: Manwai Nguyen
  * DateL Sep 11, 2017
  * Excercise: P3.2
  * Purpose: tell the user if num is positive or negative, large or small
  * Input: floating point number
  * Outputs: positive or negative, large or small 
  * *******************************************/

import java.util.Scanner;

public class P3_2_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask user for floating point input
    System.out.print("Please enter a floating-point number: ");
    while (!in.hasNextFloat()) {
      System.out.print("Please enter a floating-point number: ");
      in.next();
    }
    float num = in.nextFloat();
    
    // check if number is zero, negative, or positive
    if (num == 0) {
      System.out.println("zero");
    } else if (num < 0) {
      System.out.print("negative ");
    } else if (num > 0) {
      System.out.print("positive ");
    }
    
    // check if number is small or large
    if (Math.abs(num) < 1 && Math.abs(num) > 0) {
      System.out.println("small");
    } else if (Math.abs(num) > 1000000) {
      System.out.println("large");
    }
  }
}

