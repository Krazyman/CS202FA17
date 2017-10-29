/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 9, 2017
  * Excercise: P6.10
  * Purpose: check if 2 arrays have the same value as each other
  * Input: N/A
  * Outputs: True or False
  * *******************************************/
import java.util.Arrays;
public class P6_10_ManwaiNguyen {
  public static void main(String[] args) {
    
    // sample array
    int[] array1 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] array2 = {11, 11, 7, 9, 16, 4, 1};
    boolean same;
    
    // calls method to check if the array has same value
    same = sameSet(array1, array2);
    
    // prints answer
    System.out.println(same);
  }
  
  /*
   * @param a first arraylist
   * @param b second arraylist
   * @return whether both array has same value
   * */
  public static boolean sameSet(int[] a, int[] b) {
    // holds the value of whether the arrays contains the same value
    boolean[] sameTable1 = new boolean[a.length];
    boolean[] sameTable2 = new boolean[b.length];
    int index = 0;
    
    // check if second array has the first array value
    for (int element1 : a) {
      for (int element2 : b) {
        if (element1 == element2) {
          sameTable1[index] = true;
          break;
        }
      }
      index++;
    }
    index = 0;
    
    // check if first array has the second array value
    for (int element1 : b) {
      for (int element2 : a) {
        if (element1 == element2) {
          sameTable2[index] = true;
          break;
        }
      }
      index++;
    }
    
    // if they dont have same value 
    for (boolean element : sameTable1) {
      if (element == false) 
       return false; 
    }
    
    for (boolean element : sameTable2) {
      if (element == false) 
       return false; 
    }
    
    // else
    return true;
  }
}