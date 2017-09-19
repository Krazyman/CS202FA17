/*******************************************
  * Name: Manwai Nguyen
  * DateL Sep 11, 2017
  * Excercise: P3.14
  * Purpose: tell the user what card they called
  * Input: Value and suit of card
  * Outputs: Card 
  * *******************************************/

import java.util.Scanner;

public class P3_14_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    
    System.out.print("Please enter the card notation: ");
    String card = in.nextLine(); // get card
    String finalCard1, finalCard2; 
    char firstChar = card.charAt(0), secondChar = card.charAt(1); // get each character input
    String s = String.valueOf(firstChar), t = String.valueOf(secondChar);
    
    // first part of output
    switch (s) {
      case "A": finalCard1 = "Ace"; break;
      case "1": finalCard1 = "One"; break;
      case "2": finalCard1 = "Two"; break;
      case "3": finalCard1 = "Three"; break;
      case "4": finalCard1 = "Four"; break;
      case "5": finalCard1 = "Five"; break;
      case "6": finalCard1 = "Six"; break;
      case "7": finalCard1 = "Seven"; break;
      case "8": finalCard1 = "Eight"; break;
      case "9": finalCard1 = "Nine"; break;
      case "T": finalCard1 = "Ten"; break;
      case "J": finalCard1 = "King"; break;
      case "Q": finalCard1 = "Queen"; break;
      case "K": finalCard1 = "King"; break;
      default: finalCard1 = " "; break;      
    }
    
    // second part of output
    switch (t) {
      case "D": finalCard2 = "Diamonds"; break;
      case "H": finalCard2 = "Hearts"; break;
      case "S": finalCard2 = "Spades"; break;
      case "C": finalCard2 = "Clubs"; break;
      default: finalCard2 = " "; break;
    }
    if (finalCard1 != " " && finalCard2 != " ") { 
      System.out.println(finalCard1 + " of " + finalCard2);
    } else {
      System.out.println("Invalid input!");
    }
  }
}