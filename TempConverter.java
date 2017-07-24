import java.util.Scanner;

public class TempConverter {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double Celsius;
    double Fahren;
    
    System.out.print("Temp in Celcius: ");
    Celsius = in.nextDouble();
    
    Fahren = (Celsius*9/5) + 32;
    
    System.out.printf(" %.1f C = %.1f F\n", Celsius, Fahren);
  }
}