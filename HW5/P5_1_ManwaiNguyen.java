/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 7, 2017
  * Excercise: P5.1
  * Purpose: mult-purpose
  *          - return the smallest of three digits
  *          - return the average of three digits
  * Input: three digits
  * Outputs: smalles and average of the input
  * *******************************************/

import java.util.Scanner;

public class P5_1_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask the user for inputs
    System.out.println("Please input three numbers:" );
    double x = in.nextDouble(); // first digit
    double y = in.nextDouble(); // second digit
    double z = in.nextDouble(); // third digit
    
    // calculate the smallest and average using the methods
    double small = smallest(x, y, z);
    double mean = average(x, y, z);
    
    //answers
    System.out.println("The smallest of the three numbers is " + small);
    System.out.println("The average of the three numbers is " + mean);
    in.close();
  }
  
  /**
   * @param x first digit
   * @param y second digit
   * @param z third digit
   * @return the smallest digit of the three
   * */
  public static double smallest(double x, double y, double z) {
    if (x < y && x < z) { // if x is smallest
     return x; 
    } else if (y < x && y < z) { // if y is smallest
     return y;
    } else { // if z is smallest
     return z; 
    }
  }
  
  /**
   * @param x first digit
   * @param y second digit
   * @param z third digit
   * @return the average of the three
   * */
  public static double average(double x, double y, double z) {
    double mean = (x+y+z)/3; // add and divide
    return mean;
  }
}