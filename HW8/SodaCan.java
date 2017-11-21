/**
   A Soda can has a height and radius
*/

public class SodaCan {
  // initialize the attributes of a sodacan
  private double h;
  private double r;
  
  /* create a sodacan object
   * @param height of sodacan
   * @param radius of sodacan
   * */
  public SodaCan(double height, double radius) {
    h = height;
    r = radius;
  }
  
  /* return the surface area of the sodacan
   * */
  public double getSurfaceArea() {
    return (2 * Math.PI * r * h) + (2 * Math.PI *r*r);
  }
  
  /* return the volume of the sodacan
   * */
  public double getVolume() {
   return (Math.PI * r * r * h); 
  }
}