import java.util.Scanner;

public class Volume2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter the price for a six-pack: ");
    double packPrice = in.nextDouble();
    
    System.out.print("Please enter the volume for each can (in ounces): ");
    double canVolume = in.nextDouble();
    
    final double CANS_PER_PACK = 6;
    double packVolume = canVolume * CANS_PER_PACK;
    
    double pricePerOunce = packPrice / packVolume;
    System.out.printf("Price per ounce: %.4f\n", pricePerOunce);
  }
}