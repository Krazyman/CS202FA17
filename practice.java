import java.util.Scanner;

public class practice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//    String word = in.nextLine();
//    
//    String[] words = word.split(" ");
//    for (int i=0; i<words.length; i++) {
//     System.out.println(words[i]); 
//    }
    String ya= "2";
    String yeet = "1";
    int var = ya.compareTo(yeet);
    int var1 = yeet.compareTo(ya);
    System.out.println(var);
    System.out.println(var1);
  }
}