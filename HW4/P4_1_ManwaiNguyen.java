/*******************************************
  * Name: Manwai Nguyen
  * Date: Sep 24, 2017
  * Excercise: P4.1
  * Purpose: mult-purpose
  * - sum of all numbers from 2-100
  * - sum of all squares between 1 and 100
  * - all powers of 2 from 0 to 20
  * - sum of all odd numbers between a and b (inclusive)
  * - sum of all odd digits of an input
  * Input: a and b, input
  * Outputs: Card 
  * *******************************************/

import java.util.Scanner;

public class P4_1_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // askes the user for input for part d of problem
    System.out.println("Please input 2 integers to get the sum of all odd numbers between the numbers.");
    System.out.print("Please input first integer: ");
    int a = in.nextInt();
    System.out.print("Please input second integer: ");
    int b = in.nextInt();

    // loop to find the sum of all odd numbers between the 2 numbers
    int sumOfOdd=0; // sum for part d
    for (int i=a; i<=b; i++) {
      if (Math.abs(i%2)==1) 
        sumOfOdd += i;
    }
    
    // askes the user for input for part e
    System.out.print("Please input number: ");
    String number = in.nextLine();
    number = in.nextLine();
    
    // loop to find the sum for part e
    int sumOdd = 0; // sum for part e
    for (int i=0; i<number.length(); i++) {
      char s = number.charAt(i);
      int n = s - 48; // convert ascii value to integer value
      if (n%2==1) 
        sumOdd += n;
    }
    
    // loop for part a
    int evenNumbers=0;
    for (int i=2; i <=100; i+=2) {
      evenNumbers += i;
    }
    
    // loop for part b
    int sumSquares = 0;
    int checkSquares = 0;
    for (int i=1; checkSquares<=100; i++){
      checkSquares = i*i;
      if (checkSquares <= 100) {
        sumSquares += checkSquares;
      }
    }
    
    // answers
    System.out.println("The sum of all even numbers between 2 and 100 is " + evenNumbers);
    System.out.println("The sum of all squares between 1 and 100 is " + sumSquares);
    System.out.println("The sum of all powers of 2 from 0 to 20 is ");
    // loop for part c
    for (int i=0; i<=20; i++) {
      System.out.print(i + ": ");
      System.out.println(Math.pow(2, i));
    }
    System.out.println("The sum of all odd numbers between " + a + " and " + b + " is " + sumOfOdd);
    System.out.println("The sum of all odd digits of your input is " + sumOdd);
    in.close();
  }
}