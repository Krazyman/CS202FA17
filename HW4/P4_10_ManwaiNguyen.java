/*******************************************
  * Name: Manwai Nguyen
  * Date: Sep 24, 2017
  * Excercise: P4.10
  * Purpose: prints the number of vowels in the word
  * Input: word
  * Outputs: number of vowels
  * *******************************************/

import java.util.Scanner;

public class P4_10_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // ask user to input word
    System.out.print("Please input a word: ");
    String word1 = in.nextLine();
    String word2 = word1.toLowerCase(); // change word to lower case to make it easier to account for
    String vowels = "aeiouy";
    int numberOfVowels = 0;
    
    // for each letter in the word, check if it is a vowel and if it is count incre
    for (int i=0; i<word2.length(); i++) {
      for (int j=0; j<vowels.length(); j++) {
        if (word2.charAt(i) == vowels.charAt(j)) {
              numberOfVowels += 1;
              break;
        }
      }
    }
    
    // answer
    System.out.println(numberOfVowels + " vowels");   
    in.close();
  }
}