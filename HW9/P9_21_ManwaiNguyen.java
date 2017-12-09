/*******************************************
  * Name: Manwai Nguyen
  * Date: Nov 20, 2017
  * Excercise: P9.21
  * Purpose: Make appointments and checking when the appointments are
  * Input: Date and description
  * Outputs: Appointments 
  * *******************************************/
import java.util.Scanner;

public class P9_21_ManwaiNguyen {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the day: ");
    int day = in.nextInt();
    System.out.println("Please enter the month: ");
    int month = in.nextInt();
    System.out.println("Please enter the year: ");
    int year = in.nextInt();
    
    Appointment date = new Appointment("Not an appointment but a date creator", day, month, year);
    
    OneTime x = new OneTime("Doctors", 26, 11, 2017);
    Daily y = new Daily("Game", 26, 11, 2017);
    Monthly z = new Monthly("Meetings", 27, 11, 2017);
    
    if (x.occursOn(day, month, year)) {
      System.out.println(x.getDescription());
    }
    if (y.occursOn(day, month, year)) {
      System.out.println(y.getDescription());
    }
    if (z.occursOn(day, month, year)) {
      System.out.println(z.getDescription());
    }
    
  }
}