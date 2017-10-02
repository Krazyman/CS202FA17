/*******************************************
  * Name: Manwai Nguyen
  * Date: Sep 24, 2017
  * Excercise: P4.5
  * Purpose: print out the average, smallest, largest, and the range of numbers
  * Input: set floating-point number
  * Outputs: average, smallest, largest, range
  * *******************************************/

import java.util.Scanner;

public class P4_5_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // Ask user for floating-point input
    double sum=0, count=0;
    System.out.print("Please enter floating-point values, enter any string to finish: ");
    double smallest = in.nextDouble();
    double largest = smallest;
    sum += smallest;
    count ++;
    System.out.print("Please enter floating-point values, enter any string to finish: ");
    
    // keep asking for input till string appears and keep track of what is going in
    while (in.hasNextDouble()) {
     System.out.print("Please enter floating-point values, enter any string to finish: ");
     double num = in.nextDouble();
     sum += num;
     count++;
     if (num<smallest) {
       smallest = num;}
     else if (num>largest){
       largest = num; 
     }
    }
    
    // calculation
    double average = sum/count;
    double range = largest - smallest;
    
    // answer
    System.out.println("The average of the values is " + average);
    System.out.println("The smallest of the values is " + smallest);
    System.out.println("The largest of the values is " + largest);
    System.out.println("The range of the values is " + range);
    
    in.close();
  }
}

