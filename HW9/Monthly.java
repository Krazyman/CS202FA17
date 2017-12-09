/* Creates a Monthly Appointment that has a description and date */

public class Monthly extends Appointment {
  public Monthly(String description, int day, int month, int year) {
        super(description, day, month, year);
    }
  
  public boolean occursOn(int year, int month, int day) {
    return getDay() == day;
  }
}