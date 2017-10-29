/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 24, 2017
  * Excercise: P7.16
  * Purpose: Print out the total of each service
  * Input: filename
  * Outputs: total of each service
  * *******************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class P7_16_ManwaiNguyen {
  public static void main(String[] args) {
    //Scanner console = new Scanner(System.in);
    
    // ask user to for file input
    // open up file and create file to print to 
    Scanner console = new Scanner(System.in);
    String inputtedFile;
    File inputFile;
    Scanner in;
    try {
      inputtedFile = args[0];
      inputFile = new File(inputtedFile);
      in = new Scanner(inputFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      in = new Scanner(System.in); // just to make the program compile 
      // it wont compile because in might not be initialized
      // but in does not have to be initialize if the program errors out
    }
    
    // sorts the service and amount
    ArrayList<String> service = new ArrayList<String>();
    ArrayList<Double> amount = new ArrayList<Double>();
    try {
      while (in.hasNextLine()) {
        String line = in.nextLine();
        String[] catagory = line.split(":",-1);
        if (service.contains(catagory[1])) {
          int index = service.indexOf(catagory[1]);
          Double value = amount.get(index);
          value += Double.valueOf(catagory[2]);
          amount.set(index, value);
        } else {
          service.add(catagory[1]);
          amount.add(Double.valueOf(catagory[2]));
        } 
      }
    } catch (NumberFormatException e) {
     e.printStackTrace(); 
    }
    
    // prints answer
    for (int i=0; i<service.size(); i++) {
      System.out.println(service.get(i) + ": $" + amount.get(i));
    }
    
  }
}