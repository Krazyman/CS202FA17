import java.util.Scanner;

public class P2_17_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // takes the input of the first time and seperates it to hours and minutes
    System.out.println("Please enter the first time: ");
    double firstTime = in.nextDouble();
    int firstHour = (int)(firstTime/100);
    int firstMinute = (int)firstTime - firstHour*100;
    
    // takes the input of the second time and seperates it to hours and minutes
    System.out.println("Please enter the second time: ");
    double secondTime= in.nextDouble();
    int secondHour = (int)(secondTime/100);
    int secondMinute = (int)secondTime - secondHour*100;
    int hour, minute;
    
    // if the first time is in pm and second time is in am
    // add 12 hours to the first time to account for that then add 12 to result
    // else just subtract the time difference
    if (firstTime > secondTime) {
      secondHour += 12;
      hour = secondHour - firstHour;
      minute = secondMinute - firstMinute;
      hour += 12;
    } else {
      hour = secondHour - firstHour;
      minute = secondMinute - firstMinute;
    }
    
    // if the minute difference is negative, use borrow method
    if (minute < 0) {
        minute += 60;
        hour -= 1;
      }
    
    // print your calculations
    System.out.print(hour);
    System.out.print(" hours ");
    System.out.print(minute);
    System.out.print(" minutes");
  }
}

