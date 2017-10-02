/********************************
  * Program Title: ManwaiNQ1.java
  * Purpose: Compute the value of pi
  * Date: 9/25/17
  * Input: N/A
  * Output: Pi
  * *******************************/

public class ManwaiNQ1 {
  public static void main(String[] args) {
    
    final Double GIVENPI = 3.1415926; // given pi constant
    double denominator = 1, count = 0; // set variables
    double pi = 4*(1); // first pattern
    
    double epsilon=0.000000001; // number to compare when pi reaches the number
    boolean epsilonEqual = ((pi - epsilon) < GIVENPI) && ((pi + epsilon) > GIVENPI);
    // true when the number is close
         
    // pi sequence given
    while (!epsilonEqual) {
      count++; // keep track of when to add or sub
      denominator += 2; // increment of 2 on the denominator
      if (count%2==0) {
        pi += 4*(1/denominator);
      } else {
        pi -= 4*(1/denominator);
      }
      // check after each sequence
      epsilonEqual = ((pi - epsilon) < GIVENPI) && ((pi + epsilon) > GIVENPI); 
    }
 
    System.out.printf("The value of PI is %.7f.\n", pi); // answer
  }
}