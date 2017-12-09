/* Creates a superclass person which consist of a name and year of birth */

public class Person {
 private String name;
 private int birth;
 
 public Person(String n, int y) {
  name = n;
  birth = y;
 }
 
 public String getName() {
  return name; 
 }
 
 public int getBirth() {
  return birth; 
 }
 
 public void setName(String n) {
  name = n; 
 }
 
 public void setBirth(int y) {
  birth = y; 
 }
 
 public String toString() {
   String info = String.format("Name: %s, Year of Birth: %d", name, birth);
  return info;
 }
}