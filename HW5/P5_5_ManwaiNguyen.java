/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 7, 2017
  * Excercise: P5.5
  * Purpose: repeat the number of strings with given amount of time
  * Input: string and the number of times to repeat
  * Outputs: string that was concatenated number of times 
  * *******************************************/

import java.util.Scanner;

public class P5_5_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask user for input 
    System.out.println("Please input the string you want to repeat: ");
    String str = in.next();
    System.out.println("Please input the number of times you want it to repeat ");
    int numberOfTimes = in.nextInt();
    
    // run method
    String str1 = repeat(str, numberOfTimes);
    
    // answer
    System.out.println(str1);
    in.close();
  }
  
  /**
   * @param str string needed to be repeated
   * @param n number of times to repeat
   * @return string that was concatenated number of times 
   * */ 
  public static String repeat(String str, int n) {
    int count = 0; 
    String completeString = "";// empty string to concatenate
    while (count != n) { // add the given string to empty string till the number of times is satisfied
      completeString = completeString.concat(str);
      count++;
    }
    return completeString;
  }
}

