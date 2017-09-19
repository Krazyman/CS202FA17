/*******************************************
  * Name: Manwai Nguyen
  * DateL Sep 11, 2017
  * Excercise: P3.8
  * Purpose: determine if there are pairs in the 4 numbers
  * Input: 4 integers
  * Outputs: pairs or not pairs
  * *******************************************/

import java.util.Scanner;

public class P3_8_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int[] set = new int[4]; // create empty array
    
    // input 4 numbers
    for (int i=1; i<set.length+1; i++) {
      System.out.print("Please input number " + i + ": ");
      while (!in.hasNextInt()) {
        System.out.print("Please input number " + i + ": ");
        in.next();
      }
      set[i-1] = in.nextInt(); // assigns the int into the array
    }  
    
    // determine if there are pairs
    boolean pair1=false, pair2=false;
    int first, second;
    for (int i=0; i<set.length; i++) { // check all possibilities
      if (pair1 && pair2) { // if checked before all possibilities
        break; // print result
      }
      for (int j=i+1; j<set.length; j++) {
        if (i!=j && set[i] == set[j]) { // if a pair
          if (!pair1) {
            pair1 = true;
          } else { //if second pair
            pair2 = true;
          }
        }
      }
    }
    
    // print result
    if (pair1 && pair2) {
      System.out.println("two pairs");
    } else {
      System.out.println("not two pairs");
    }
  }
}
