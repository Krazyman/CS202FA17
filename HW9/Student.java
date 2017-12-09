/* Creates a Student that is a person and has a major */

public class Student extends Person {
    private String major;

    public Student(String name, int yearOfBirth, String m) {
        super(name, yearOfBirth);
        major = m;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String m) {
        major = m;
    }

    public String toString() {
      String info = String.format(super.toString() + ", major: %s", major);
      return info;
    }
}