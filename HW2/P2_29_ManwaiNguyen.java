import java.util.Scanner;

public class P2_29_ManwaiNguyen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final double a = 17.27, b = 237.7; // your set constants
    
    // ask the user for input between (0 and 1) for humidity
    System.out.print("The relative humidity (between 0 and 1): ");
    double RH = in.nextDouble();
    while (RH < 0 || RH > 1) {
    System.out.print("The relative humidity (between 0 and 1): ");
      RH = in.nextDouble();
    }
    
    // ask the user for input for temperature
    System.out.print("The actual temperature: ");
    double T = in.nextDouble();
    
    // calculate the dew temperature
    double dewTemperature = ((a*T)/(b+T)) + Math.log(RH);
    
    // print dew temperature
    System.out.println("The dew temperature is " + dewTemperature + ".");
  }
}

    