/********************************
  * Program Title: ManwaiNQ2.java
  * Purpose: check whether two arrays have the same elements in some order, with same multiplicities
  * Date: 11/3/17
  * Input: two integer arrays
  * Output: true or false
  * *******************************/

import java.util.Arrays;

public class ManwaiNQ2 {
  public static void main(String[] args) {
    
    // test arrays
    int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] b = {11, 1, 4, 9, 16, 9, 7, 4, 9};
    int[] c = {11, 11, 7, 9, 16, 4, 1, 4, 9};
    
    // call method to find out if array has same elements on the sample arrays
    boolean first = sameElements(a, b);
    boolean second = sameElements(a, c);
    
    // whether arrays a and b have same elements and same multiplicities
    if (first) { 
      System.out.println("Identical");
    } else {
      System.out.println("Not Identical");
    }
    
    if (second) { 
      System.out.println("Identical");
    } else {
      System.out.println("Not Identical");
    }
  }
  
  /* Purpose of method: check with two integer arrays have same multiplicites of their elements
   * @param a first integer array
   * @param b second integer array
   * @return true or false
   * */
  public static boolean sameElements(int[] a, int[] b) {
    // if length of array is different, then the array is automatically not the same
    if (a.length != b.length) {
     return false; 
    } 
    
    // assign values to new arrays to avoid changing original array values
    // sort to make it easier
    int[] array1 = Arrays.copyOf(a, a.length);
    int[] array2 = Arrays.copyOf(b, b.length);
    Arrays.sort(array1);
    Arrays.sort(array2);
    
    // run through the arrays
    for (int i=0; i<array1.length; i++) {
      if (array1[i] != array2[i]) {
       return false; 
      }
    }
    // if not problem return true
    return true;
  }
}