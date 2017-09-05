/*******************************************
  * Name: Manwai Nguyen
  * DateL Aug 23, 2017
  * Excercise: P1.2
  * Purpose: to find the sum of the first ten positivie numbers
  * Input: None
  * Outputs: Sum
  * *******************************************/

public class P1_2_ManwaiNguyen 
{
  public static void main(String[] args) 
   {
    double num=0; // Create the variable to use for calculating the sum 
    for (int i=1; i<11; i++) { // Adds ten positive integers in the loop
     num+=i;
    }
    System.out.println(num);
   }
 }