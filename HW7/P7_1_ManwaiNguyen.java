/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 24, 2017
  * Excercise: P7.1
  * Purpose: Store "Hello World!" in hello.txt then prints it
  * Input: None
  * Outputs: "Hello World!"
  * *******************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_1_ManwaiNguyen {
  public static void main(String[] args) throws FileNotFoundException {    
    String fileName = "hello.txt"; 
    
    // opens hello.txt and prints "Hello World!"
    File inputFile = new File(fileName);
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter(fileName);
    out.print("Hello, World!");
    
    // close file
    in.close();
    out.close();
    
    // opens the file again and prints its content
    File newInputFile = new File(fileName);
    Scanner ins = new Scanner(newInputFile);
    String statement = ins.nextLine();
    System.out.println(statement);
  }
}