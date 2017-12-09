/* Creates an Instructor that is a person and has a salary */

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double s) {
        super(name, yearOfBirth);
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public String toString() {
      String info  = String.format(super.toString() + ", Salary: $%,.2f",salary);
      return info;
    }
}