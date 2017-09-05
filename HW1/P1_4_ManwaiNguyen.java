/*******************************************
  * Name: Manwai Nguyen
  * DateL Aug 23, 2017
  * Excercise: P1.4
  * Purpose: find the balance of an account after the first 3 years
  * Input: None
  * Outputs: Balance
  * *******************************************/

public class P1_4_ManwaiNguyen
{
  public static void main(String[] args) 
   {
    double balance=1000; // Initialize the balance variable for the account
    for (int i=0; i<3; i++) { // Calculate the new balance each year
     balance*=1.05; 
     System.out.println(balance);
    }
   }
 }