/*******************************************
  * Name: Manwai Nguyen
  * DateL Sep 11, 2017
  * Excercise: P3.34
  * Purpose: Calculate the discount coupon given
  * Input: amount used in market
  * Outputs: discount given and will receive
  * *******************************************/

import java.util.Scanner;

public class P3_34_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter the cost of your groceries: ");
    while (!in.hasNextDouble()) {
      System.out.print("Please enter the cost of your groceries: ");
      in.next();
    }
    double money = in.nextDouble();
    
    // check where you land depending on your amount
    if (money<10) {
      System.out.println("No coupon");
    } else if (money<60) {
      System.out.print("You win a discount coupon of $");
      System.out.print(Math.round((money * 0.08) * 100.0) / 100.0); // calculate discount
      System.out.println(". (8% of your purchase)");
    } else if (money<150) {
      System.out.print("You win a discount coupon of $");
      System.out.print(Math.round((money * 0.1) * 100.0) / 100.0);
      System.out.println(". (10% of your purchase)");
    } else if (money<210) {
      System.out.print("You win a discount coupon of $");
      System.out.print(Math.round((money * 0.12) * 100.0) / 100.0);
      System.out.println(". (12% of your purchase)");
    } else {
      System.out.print("You win a discount coupon of $");
      System.out.print(Math.round((money * 0.14) * 100.0) / 100.0);
      System.out.println(". (14% of your purchase)");
    }
    
  }
}