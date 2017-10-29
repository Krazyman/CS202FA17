/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 24, 2017
  * Excercise: P7.6
  * Purpose: print the line the word is in
  * Input: word to find and the files to search in
  * Outputs: file: line that contains word
  * *******************************************/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_6_ManwaiNguyen {
  public static void main(String[] args) throws IOException {
    String keyWord = args[0];
    for (int i=1; i < args.length; i++) {
      File inputFile = new File(args[i]);
      Scanner in = new Scanner(inputFile);
      while (in.hasNextLine()) {
        String line = in.nextLine();
        if (line.indexOf(keyWord) != -1) {
          System.out.println(args[i] + ": " + line);  
        }
      }
    }
  }
}