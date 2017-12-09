/* Creates an Appointment that has a description, day, month and year */

public class Appointment {
    private String description;
    private int day, month, year;

    public Appointment(String d, int day, int month, int year) {
      description = d;
      day = day;
      month = month;
      year = year;
    }

    public String getDescription() {
      return description;
    }
    
    public int getDay() {
     return day; 
    }
    
    public int getMonth() {
      return month; 
    }
    
    public int getYear() {
      return year; 
    }
    
    public String getDate() {
      String date = String.format("%d/%d/%d", day, month, year);
      return date;
    }

    public void setDescription(String d) {
      description = d;
    }

    public void setDate(int day, int month, int year) {
      day = day;
      month = month;
      year = year;
    }

    public String toString() {
      return String.format("Appointment: %s, Date: %s", description, getDate());
    }

    public boolean occursOn(int year, int month, int day) {
      String date = String.format("%d/%d/%d", day, month, year);
      if(getDate().compareTo(date) == 0) {
       return true; 
      }
      return false;
    }
}