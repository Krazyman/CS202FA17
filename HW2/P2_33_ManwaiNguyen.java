/*******************************************
  * Name: Manwai Nguyen
  * DateL Sep 6, 2017
  * Excercise: P2.33
  * Purpose: to find the electric force of two particles
  * Input: charge of both particles and distance 
  * Outputs: electric force
  * *******************************************/

import java.util.Scanner;

public class P2_33_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final double EPSILON = 8.854E-12; // epsilon constant
    
    // ask user for charge of Q1
    System.out.print("Charge of Q1 in Coulombs: ");
    double charge1 = in.nextDouble();
    
    // ask user for charge of Q2
    System.out.print("Charge of Q2 in Coulombs: ");
    double charge2 = in.nextDouble();
    
    // ask user for distance between charges
    System.out.print("Distance of Q1 and Q2 in meters: ");
    double distance = in.nextDouble();
    
    // calculate the electirc force
    double force = charge1 * charge2 / (4 * Math.PI * EPSILON * Math.pow(distance, 2));
    
    // print result
    System.out.print("The electric force between two charged paricles of Q1 and Q2 is ");
    System.out.print(force);
    System.out.print(" N.");
  }
}
