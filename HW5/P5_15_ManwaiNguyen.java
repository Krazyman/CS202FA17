/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 7, 2017
  * Excercise: P5.15
  * Purpose: reverse the order of the letters in a string
  * Input: string
  * Outputs: reverse of the string
  * *******************************************/

import java.util.Scanner;

public class P5_15_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask for user input
    System.out.println("Please input a string: ");
    String str = in.next();
    
    // reverse string through method
    str = reverse(str);
    
    // answer
    System.out.println("The reverse string is " + str);
    in.close();
  }
  
  /**
   * @param str string to be reversed
   * @return str1 reversed string
   * */
  public static String reverse(String str) {
   String str1 = "";
   if (str.length() != 1) { // if string has more than one letter
    String c = Character.toString(str.charAt(str.length()-1)); // grab the last letter
    str1 = str1.concat(c); // add the last letter to the empty string
    str1 = str1.concat(reverse(str.substring(0,str.length()-1))); // keep calling it till last letter
   } else {
    return str; // once last letter stop recursion
   }
   return str1; // return already flipped string
  }
}
