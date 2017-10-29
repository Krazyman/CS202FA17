/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 9, 2017
  * Excercise: P6.21
  * Purpose: print out bar of asterisk with max asterisk of 40 on highest value
  * Input: numbers to be in bar graph
  * Outputs: bar graph of asterisk of inputted value
  * *******************************************/

import java.util.Scanner;
import java.util.ArrayList;

public class P6_21_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask user to input values into arraylist
    ArrayList<Double> barChart = new ArrayList<Double>();
    System.out.println("Please input values for bar chart, enter any string to quit: ");
    while (in.hasNextDouble()) {
     barChart.add(in.nextDouble()); 
    }
    
    // finds out the highest value and how to distribute the values to the bargraph 
    final double peek = 40;
    double max = largest(barChart);
    boolean greater = greaterThan(max, peek);
    
    // print out bar graph of asterisks
    printBar(barChart, greater, max, peek);
    
    in.close();
    
  }
  
  /*
   * @param a number
   * @param b number
   * @return boolean whether a is greater than b
   * */ 
  public static boolean greaterThan(double a, double b) {
    if (a >= b) {
      return true;
    } else {
      return false;
    }
  }
  
  /*
   * @param array arraylist of numbers
   * @return the largest number in the array
   * */
  public static double largest(ArrayList<Double> array) {
    double large = array.get(0);
    for (int i=1; i<array.size(); i++) {
      if (array.get(i) > large) {
       large = array.get(i); 
      }
    }
    return large;
  }
  
  /*
   * @param array arraylist of numbers
   * @param greater whether the largest number is greater than max number of asterisk
   * @param max largest number
   * @param peek 40 asterisk 
   * */
  public static void printBar(ArrayList<Double> array, boolean greater, double max, double peek) {
    if (greater) {
     double factor = max/peek; // 
     for (int i=0; i<array.size(); i++) {
       for (int j=0; j<(array.get(i)/factor); j++) {
        System.out.print("*"); 
       }
       System.out.println();
     }
    } else {
     double factor = peek/max;
     for (int i=0; i<array.size(); i++) {
       for (int j=0; j<(array.get(i)*factor); j++) {
        System.out.print("*"); 
       }
       System.out.println();
     }
    }
  }
}