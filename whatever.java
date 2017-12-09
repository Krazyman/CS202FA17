import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class whatever {
  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<ArrayList> nums = new ArrayList<>();
    
    File inputFile = new File("in1");
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter("yeet.txt");
    
    int lineCounter = 0;
    while(in.hasNextLine()){
      ArrayList<Double> num = new ArrayList<>();
      String str;
      str = in.nextLine();
      String[] strs = str.split("\\s+");
      for (int i=0; i<strs.length; i++) {
       num.add(Double.parseDouble(strs[i])); 
      }
      nums.add(num); 
        
    }
    Double[] sums = {0.0, 0.0, 0.0};
    
    System.out.println(nums.toString());
    for(int i=0; i<nums.size(); i++) {
      for(int j=0; j<nums.get(i).size(); j++){
        double ya = (Double)nums.get(i).get(j);
        out.printf("%5.1f", ya);
        sums[j] += ya;        
      }
      out.print("\n");
    }
    out.print("Sum: ");
    for (int i=0; i<sums.length;i++) {
     out.printf("%5.1f",sums[i]);
    }
    System.out.print(Arrays.toString(sums));
   
    in.close();
    out.close();
  }
  
}