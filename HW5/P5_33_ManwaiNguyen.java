/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 7, 2017
  * Excercise: P5.33
  * Purpose: find the focal length of the lens with given formula
  * Input: both radius of lens, thickness of lengths, index of refractive
  * Outputs: focal length of length
  * *******************************************/

import java.util.Scanner;

public class P5_33_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask for use input
    System.out.println("Please input the radii of curvature R1: (mm)");
    double r1 = in.nextDouble();
    System.out.println("Please input the radii of curvature R1: (mm)");
    double r2 = in.nextDouble();
    System.out.println("Please input the refractive index of the lens medium: ");
    double n = in.nextDouble();
    System.out.println("Please input the thickness of lens: (mm)");
    double d = in.nextDouble();
    
    // calculate with method
    double focalLength = focal(r1, r2, n, d);
    
    // answer
    System.out.printf("The focal length of the lens is %.2f (mm).\n",focalLength);
    in.close();
  }
  
  /**
   * @param r1 first radius of the lens
   * @param r2 second raidus of the lens
   * @param n index of refractive
   * @param d thickness of the lens
   * @return focal length
   * */
  public static double focal(double r1, double r2, double n, double d) {
   return 1/((n-1)*((1/r1)-(1/r2)+(((n-1)*d)/(n*r1*r2)))); // given formula
  }
}
