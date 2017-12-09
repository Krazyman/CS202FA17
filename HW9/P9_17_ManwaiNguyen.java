/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 20, 2017
  * Excercise: P9.17
  * Purpose: Reads all words from input prints a list of the short words
  * Input: words
  * Outputs: short words
  * *******************************************/
import java.util.Scanner;
import java.util.ArrayList;

class P9_17_ManwaiNguyen {  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    ArrayList<Object> objects = new ArrayList<Object>();
    
    System.out.println("Please enter string or integer to exit: ");
    while (!in.hasNextInt()) {
      System.out.println("Please enter string or integer to exit: ");
      objects.add(in.next());
    }
    
    ShortWordFilter shortWord = new ShortWordFilter();
    ArrayList<Object> filtered = collectAll(objects, shortWord);
    System.out.println(filtered.toString());
    }

    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f) {
      ArrayList<Object> filtered = new ArrayList<Object>();
      
      for(int i=0; i<objects.size(); i++) {
        if (f.accept(objects.get(i))) {
          filtered.add(objects.get(i));
        }
      }
      return filtered;
    }  
}