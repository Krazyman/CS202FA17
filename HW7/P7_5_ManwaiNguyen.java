/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 24, 2017
  * Excercise: P7.5
  * Purpose: Print out the number of characters, word, and lines in a file
  * Input: file to be read
  * Outputs: number of characters, word, and lines in the file
  * *******************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_5_ManwaiNguyen {
  public static void main(String[] args) throws FileNotFoundException {
    // ask user for input
    Scanner console = new Scanner(System.in);
    System.out.println("Please input filename: ");
    String inputtedFile = console.next();
    console.close();
    
    // initialize variables
    int characters = 0;
    int words = 0;
    int lines = 0;
    
    // open file and readlines twice
    File inputFile = new File(inputtedFile);
    Scanner in = new Scanner(inputFile);
    Scanner in2 = new Scanner(inputFile);
    
    // number of characters and lines
    while (in.hasNextLine()) {
      String line = in.nextLine();
      characters += line.length();
      lines++;
    }
    
    // number of words
    while (in2.hasNext()) {
     in2.next();
     words++;
    }
    
    //answer
    in.close();
    System.out.println("Number of lines: " + lines);
    System.out.println("Number of words: " + words);
    System.out.println("Number of characters: " + characters);
  }
}