/********************************
  * Program Title: ManwaiNQ2.java
  * Purpose: Figure out when Easter Sunday is for given year
  * Date: 9/25/17
  * Input: year
  * Output: Month and day
  * *******************************/

import java.util.Scanner;

public class ManwaiNQ2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // asks user for input
    System.out.print("Please input year to find Easter Sunday date: ");
    int year = in.nextInt(); 
    String month;
    
    // given formula
    int a = year%19;
    int b = year/100;
    int c = year%100;
    int d = b/4;
    int e = b%4;
    int g = (8*b+13)/25;
    int h = (19*a+b-d-g+15)%30;
    int j = c/4;
    int k = c%4;
    int m = (a+11*h)/319;
    int r = (2*e+2*j-k-h+m+32)%7;
    int n = (h-m+r+90)/25;
    int p = (h-m+r+n+19)%32;
    
    // Easter Sunday can only happen in March and April
    switch(n) {
      case 3: month = "March"; break;
      case 4: month = "April"; break;
      default: month = ""; break;
    }
    
    // answer
    System.out.println("Easter Sunday in the year of " + year + " is on " + month + " " + p + ".");
    
    in.close();
  }
}