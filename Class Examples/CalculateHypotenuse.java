/*******************************************
  * Name: Manwai Nguyen
  * DateL Aug 23, 2017
  * Excercise: another example in class
  * Purpose: to calculate the hypotenuse
  * Input: the sides a and b 
  * Outputs: the hypotenuse c
  * *******************************************/

public class CalculateHypotenuse
{
  public static void main(String[] args) 
  {
    double a=8, b=9, c;
    c = Math.sqrt(a*a + b*b);
    System.out.println("The hypotenuse is " + c);
  }
}
