/*******************************************
  * Name: Manwai Nguyen
  * DateL Sep 6, 2017
  * Excercise: P2.6
  * Purpose: convert meters to miles, foot, and inches
  * Input: meters
  * Outputs: miles, foot, inches
  * *******************************************/

import java.util.Scanner;

public class P2_6_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask the user for measurement to calculate
    System.out.print("Please input number of meters to convert: ");
    Double meter = in.nextDouble();
    
    // conversion constants
    final Double MILES = 0.000621371, FOOT = 3.28084, INCHES = 12.0;
    
    // calculate the conversions
    Double newMiles = meter * MILES;
    Double newFoot = meter * FOOT;
    Double newInches = newFoot * INCHES;
    
    // print results
    System.out.printf("%.2f meters is %.8f miles\n",meter, newMiles);
    System.out.printf("%.2f foot is %.8f miles\n", meter, newFoot);
    System.out.printf("%.2f inches is %.8f miles",meter, newInches);
  }
}
