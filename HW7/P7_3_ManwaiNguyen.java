/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 24, 2017
  * Excercise: P7.3
  * Purpose: add line numbers to each line in the file
  * Input: filename
  * Outputs: new file with line numbers
  * *******************************************/
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class P7_3_ManwaiNguyen {
  public static void main(String[] args) throws IOException{
    // ask user to for file input and open up file and create file to print to 
    Scanner console = new Scanner(System.in);
    String inputtedFile;
    File inputFile;
    Scanner in;
    try {
     inputtedFile = args[0];
     inputFile = new File(inputtedFile);
     in = new Scanner(inputFile);
    } catch (IOException e) {
     System.out.println("Please input filename: ");
     inputtedFile = console.next();
     inputFile = new File(inputtedFile);
     in = new Scanner(inputFile);
    }
    // output file
    PrintWriter out = new PrintWriter("7_3Out.txt");
    
    // print line number with delimiter and the line from input file
    int lineNumber = 1;
    while (in.hasNextLine()) {
     out.printf("/* %d */ ", lineNumber);
     out.println(in.nextLine());
     lineNumber++;
    }    
    // close file
    in.close();
    out.close();    
  }
}