import java.util.Scanner;

public class python {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter a positive integer (between 1 and 100) or 0 to quit: ");
    int num = in.nextInt();
    while(num > 0 && num < 101) {
      
      for (int i=1; i<=num; i++) {
        System.out.print(i + " ");
        if (i%20==0) {
          System.out.println(); 
        }
      }
      
      System.out.println("\nPlease enter a positive integer (between 1 and 100) or 0 to quit: ");
      num = in.nextInt();
    }
    
    in.close();
    
  }
}