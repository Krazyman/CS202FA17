/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 8, 2017
  * Excercise: P8.19
  * Purpose: Utilize the Portfolio constructor
  * Input: N/A
  * Outputs: savings and checkings balance
  * *******************************************/

public class P8_19_ManwaiNguyen {  
  public static void main(String[] args) { 
    Portfolio manwai = new Portfolio(); // Create a portfolio
    
    // deposit money
    manwai.deposit(1000, "c");
    manwai.deposit(10000, "s");
    System.out.println("Checkings: " + manwai.getBalance("c"));
    System.out.println("Savings: " + manwai.getBalance("s"));
    
    // withdraw money
    manwai.withdraw(34.67, "c");
    manwai.withdraw(775.86, "s");
    System.out.println("Checkings: " + manwai.getBalance("c"));
    System.out.println("Savings: " + manwai.getBalance("s"));
    
    // transfer money from savings
    manwai.transfer(34.67, "s");
    System.out.println("Checkings: " + manwai.getBalance("c"));
    System.out.println("Savings: " + manwai.getBalance("s"));
    
    // transfer money from checkings
    manwai.transfer(235.76, "c");
    System.out.println("Checkings: " + manwai.getBalance("c"));
    System.out.println("Savings: " + manwai.getBalance("s"));
        
  }
}