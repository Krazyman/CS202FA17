/********************************
  * Program Title: ManwaiNQ3.java
  * Purpose: computes taxes
  * Date: 9/25/17
  * Input: marital status and income
  * Output: percent of tax and total tax
  * *******************************/

import java.util.Scanner;

public class ManwaiNQ3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask user for info 
    System.out.println("Please input your marital status (single or married): ");
    String status1 = in.next();
    status1 = status1.toLowerCase();
    // make user inputs right value
    while (status1.compareTo("single")!= 0 && status1.compareTo("married")!= 0) {
      System.out.println("Please input a valid marital status: ");
      status1 = in.next();
      status1 = status1.toLowerCase();
    }
    
    System.out.println("Please input your taxable income: ");
    double income = in.nextDouble();
    
    // if user is single
    if (status1.compareTo("single")==0) {
      if (income >= 0 && income <= 8000) {
        double tax = .1;
        System.out.print("The tax you will have to pay is $");
        System.out.printf("%.2f",tax * income);
        System.out.println(" (10%) of your taxable income.");
      } else if (income <= 32000) {
        double tax = .15;
        System.out.print("The tax you will have to pay is $");
        System.out.printf("%.2f",(tax * income) + 800);
        System.out.println(" (15% + $800) of your taxable income.");
      } else {
        double tax = .25;
        System.out.print("The tax you will have to pay is $");
        System.out.printf("%.2f",(tax * income) + 4400);
        System.out.println(" (25% + $4,400) of your taxable income.");
      }
    }

    // if user is married
    if (status1.compareTo("married")==0) {
      if (income >= 0 && income <= 16000) {
        double tax = .1;
        System.out.print("The tax you will have to pay is $");
        System.out.printf("%.2f", tax * income);
        System.out.println(" (10%) of your taxable income.");
      } else if (income <= 64000) {
        double tax = .15;
        System.out.print("The tax you will have to pay is $");
        System.out.printf("%.2f", (tax * income) + 1600);
        System.out.println(" (15% + $1,600) of your taxable income.");
      } else {
        double tax = .25;
        System.out.print("The tax you will have to pay is $");
        System.out.printf("%.2f", (tax * income) + 8800);
        System.out.println(" (25% + $8,800) of your taxable income.");
      }
    }
    in.close();
  }
}