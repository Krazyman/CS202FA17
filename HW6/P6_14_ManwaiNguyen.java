/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 9, 2017
  * Excercise: P6.14
  * Purpose: print 20 random numbers and the same numbers sorted
  * Input: N/A
  * Outputs: 20 random numbers , 10 random numbers sorted
  * *******************************************/
import java.util.Arrays;

public class P6_14_ManwaiNguyen {
  public static void main(String[] args) {
    final int length = 20; // number of random numbers
    int[] randomTable = new int[length];
    
    // set random number into array
    for (int i=0; i<randomTable.length; i++) {
     int num = (int)(Math.random() * 100);
     randomTable[i] = num;
    }
    System.out.println("Random numbers: " + Arrays.toString(randomTable));
    
    // sorted array
    Arrays.sort(randomTable);
    System.out.println("Sorted Random numbers: " + Arrays.toString(randomTable));
    
  }
}