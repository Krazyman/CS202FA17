/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 8, 2017
  * Excercise: P8.5
  * Purpose: create a soda can using the SodaCan class
  * Input: N/A
  * Outputs: The surface area and volume of the sodacan
  * *******************************************/

public class P8_5_ManwaiNguyen {  
  public static void main(String[] args) { 
    // calls the soda can class and creates a sodacan
    SodaCan coke = new SodaCan(2.5, 3.0);
    
    // print out the surface area and volume of can
    System.out.println("The surface area of the coke soda can is " + coke.getSurfaceArea());
    System.out.println("The volume of the coke soda can is " + coke.getVolume());
  }
}