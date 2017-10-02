/********************************
  * Program Title: ManwaiNQ4.java
  * Purpose: Multipurpose
  * - print uppecase letters in the string
  * - Every second letter of the string
  * - The string, with all vowels replaced by an underscore
  * - The number of vowels in the string.
  * - The positions of all vowels in the string
  * Date: 9/25/17
  * Input: year
  * Output: Month and day
  * *******************************/

import java.util.Scanner;

public class ManwaiNQ4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   
    // ask user for string input
    System.out.print("Please input a string: ");
    String word = in.nextLine();
    
    // find out which letter is in the string is uppercase
    final int ASCIISTART = 65, ASCIIEND = 90;
    String upperCase =""; // set of uppercase letters
    for (int i=0; i<word.length(); i++){
      if (word.charAt(i) >= ASCIISTART  && word.charAt(i) <= ASCIIEND) {
        upperCase = upperCase + word.charAt(i) + ", ";
      }
    }
      
    // creating the new word, finding vowels and its position
    final String vowels = "aeiouAEIOU";
    String newWord = word; // the word with _ replacing vowels
    int count = 0; // number of vowels
    String position = ""; // the location of each vowel in the string
    String position1 =""; // the location of each vowel in the string according to the example
    String secondLetter= "";
    for (int i=0; i<word.length(); i++){
      for (int j=0; j<vowels.length(); j++) {
        if (word.charAt(i) == vowels.charAt(j)) {
          newWord= newWord.substring(0, i) + "_" + newWord.substring(i+1);
          count++;
          position = position + i + ", ";
          position1 = position1 + (i+1) + ", ";
          break; // if the vowel is found, stop checking vowels
        }
      }
    }
    
    // remove "," at the end of the string
    upperCase = upperCase.substring(0, upperCase.length() -2);
    position = position.substring(0, position.length() -2);
    position1 = position1.substring(0, position1.length() -2);
    
    // answers
    System.out.println("a.  Uppercase letters in the string are: {" + upperCase + "}");
    System.out.printf("b.  The second letter in the string is : {%s}\n", word.charAt(1));
    System.out.println("c.  The string with all vowels replaced by an underscore is: {" 
                         + newWord + "}");
    System.out.println("d.  The number of vowels in the string is: " + count);
    System.out.println("e.  The positions of all vowels in the string are: (" + position + "}");
    System.out.println("extra:  If it was done according to example then the answer for e would be: (" 
                         + position1 + "}");
    
    in.close();
  }
}
