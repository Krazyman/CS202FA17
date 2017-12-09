/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 20, 2017
  * Excercise: P9.8
  * Purpose: Demonstrates the person superclass along with student and instructor sub classes
  * Input: N/A
  * Outputs: Student, Instructor, Person
  * *******************************************/

public class P9_8_ManwaiNguyen {  
  public static void main(String[] args) { 
    Person adam = new Person("Adam", 1998);
    Student manwai = new Student("Manwai", 1996, "Computer Science");
    Instructor frank = new Instructor("Frank", 1961, 10000000);
    
    System.out.println(adam.toString());
    System.out.println(manwai.toString());
    System.out.println(frank.toString());
  }
}