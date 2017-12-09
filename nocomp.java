import java.util.Arrays;

public class nocomp {
  public static void main(String[] args) {
    int [] myArray = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int sum1 =0, sum2 = 0, sum3 = 0, sum4 = 0;
    
    for (int i=0; i<myArray.length; i++){
      sum1 += myArray[i];
    }
    
    for (int num : myArray) {
      sum2 += num;
    }
    
    int index = 0;
    while(index < myArray.length) {
      sum3 += myArray[index];
      index ++;
    }
    
    int index2 = 0;    
    do {
      sum4 += myArray[index2];
      index2 ++;
    } while (index2 < myArray.length);
    
    System.out.println("for loop: The sum is " + sum1 + ".");
    System.out.println("for each loop: The sum is " + sum2 + ".");
    System.out.println("while loop: The sum is " + sum3 + ".");
    System.out.println("do loop: The sum is " + sum4 + ".");
  }
}