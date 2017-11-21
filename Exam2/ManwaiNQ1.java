/********************************
  * Program Title: ManwaiNQ1.java
  * Purpose: determine whether a year is a leap year or not
  * Date: 11/3/17
  * Input: year
  * Output: leap year or not leap year
  * *******************************/

import java.util.Scanner;

public class ManwaiNQ1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask user for input
    System.out.println("Please enter a year: ");
    int year = in.nextInt();
    boolean leap = isLeapYear(year);
    
    // prints answer
    if (leap) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
  
  /* Purpose of method: return whether year is leap year or not
   * @param year year to check
   * @return if year is leap year or not
   * */
  public static boolean isLeapYear(int year) {
    if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
      return true;
  }
    return false;
  }
}