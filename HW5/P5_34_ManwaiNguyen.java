/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 7, 2017
  * Excercise: P5.34
  * Purpose: find the volume and surface area of the container
  * Input: height of container and both radius of container
  * Outputs: volume and surface area of the container
  * *******************************************/

import java.util.Scanner;

public class P5_34_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask for user input
    System.out.println("Please enter the radius r1 of the laboratory container: ");
    double r1 = in.nextDouble();
    System.out.println("Please enter the raidus r2 of the laboratory container: ");
    double r2 = in.nextDouble();
    System.out.println("Please enter the height of the laboratory container: ");
    double h = in.nextDouble();
    
    // calculate using methods with given formulas
    double vol = volume(h, r1, r2);
    double surfaceArea = surface_area(h, r1, r2);
    
    // answer
    System.out.printf("The volume of the laboratory container is %.2f units.\n", vol);
    System.out.printf("The surface area of the laboratory container is %.2f units.\n", surfaceArea);
    in.close();
  }
  /**
   * @param h height of container
   * @param r1 first radius of container
   * @param r2 second radius of container
   * @return volume of container
   * */
  public static double volume(double h, double r1, double r2) {
   return (Math.PI/3)*h*((r1*r1)+(r2*r2)+(r1*r2)); // given volume formula
  }
  /**
   * @param h height of container
   * @param r1 first radius of container
   * @param r2 second radius of container
   * @return surface area of container
   * */
  public static double surface_area(double h, double r1, double r2) {
   // given surface area formula
   return Math.PI*(r1+r2)*Math.sqrt(((r2-r1)*(r2-r1))+(h*h)+(Math.PI*r1*r1)); 
  }
}
