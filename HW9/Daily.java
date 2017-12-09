/* Creates a Daily Appointment that has a description and date */

public class Daily extends Appointment {
  public Daily(String description, int day, int month, int year) {
        super(description, day, month, year);
    }
  
  public boolean occursOn(int year, int month, int day) {
      return true; // because its always daily
    }
}