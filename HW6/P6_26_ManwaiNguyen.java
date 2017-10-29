/*******************************************
  * Name: Manwai Nguyen
  * Date: Oct 9, 2017
  * Excercise: P6.26
  * Purpose: append to arraylist
  * Input: N/A
  * Outputs: appended arraylist
  * *******************************************/

import java.util.Arrays;
import java.util.ArrayList;

public class P6_26_ManwaiNguyen {
  public static void main(String[] args) {
    // sample arraylists
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    array1.add(1);
    array1.add(4);
    array1.add(9);
    array1.add(16);
    
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    array2.add(9);
    array2.add(7);
    array2.add(4);
    array2.add(9);
    array2.add(11);
    
    // new arraylist that will have both arraylist values 
    ArrayList<Integer> array3 = new ArrayList<Integer>();
    array3 = append(array1, array2);
    
    // answer
    System.out.println(Arrays.toString(array3.toArray()));
  }
  
  /*
   * @param a first arraylist
   * @param b second arraylist
   * @return arraylist that has first and second array combined
   * */
  public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
    for (int i=0; i<b.size(); i++) {
     a.add(b.get(i)); 
    }
    
    return a;
  }
}