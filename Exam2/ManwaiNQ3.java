/********************************
  * Program Title: ManwaiNQ3.java
  * Purpose: find the average of ten floating point numbers
  * Date: 11/3/17
  * Input: input.txt
  * Output: output.txt
  * *******************************/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManwaiNQ3 {
  public static void main(String[] args) throws IOException {
    // grab the input and output file names
    String inputtedFile = args[0];
    String outputFile = args[1];
    
    // call the method and since the method returns the output file
    // as asked, we will assign it to a variable.
    PrintWriter finalFile = findAverage(inputtedFile, outputFile);    
  }
  
  /* Purpose of method: find the average of floating numbers in the input file and write to output file
   * @param inputtedFile the name of the file to read from
   * @param outputFile the name of the file to write to
   * @return the output file 
   * */
  public static PrintWriter findAverage(String inputtedFile, String outputFile) throws IOException {
    // set up reading the file and writing to file
    File inputFile = new File(inputtedFile);
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter(outputFile);
    
    // initialize variables
    int count = 0;
    double sum = 0, average, num;
    
    // read each line and add the value to the sum and then count how many lines it has gone through
    while (in.hasNext()) {
      num = Double.parseDouble(in.next());
      sum += num;
      count ++;
      out.println(num);
    }
    
    // close input file
    in.close();
    
    // calculate the average and write it to output file
    average = sum/count;
    out.println(average);
    
    // close output file and return it back to the main method
    // note: if I would not have to return it to the main method, this method's return value would be void
    out.close();
    return out;
  }
}