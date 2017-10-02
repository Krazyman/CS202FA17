/*******************************************
  * Name: Manwai Nguyen
  * Date: Sep 24, 2017
  * Excercise: P4.15
  * Purpose: print out the count of the values, average, and standard deviation
  * Input: set of floating-point data values
  * Outputs: values, average, standard deviation1
  * *******************************************/

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // Ask user for floating-point value
    double sum=0, count=0, sumSquare=0;
    boolean yeet = true;
    do {
     System.out.print("Please enter floating-point values, enter any string to finish: ");
     yeet = in.hasNextDouble();
     if (!yeet) break;
     double num = in.nextDouble();
     sum += num;
     count++;
     sumSquare += (num*num);
    } while (yeet);
    
    // calculate average and standard deviation
    double average = sum/count;
    double standardDeviation = Math.sqrt(((sumSquare)-((1/count)*(sum*sum)))/(count-1));
    
    // answer 
    System.out.println("The count of the values is " + count);
    System.out.println("The average of the values is " + average);
    System.out.println("The standard deviation is " + standardDeviation);
    
    in.close();
  }
}