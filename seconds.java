import java.util.Scanner;

public class seconds {
  public static void main(String[] args) {
    
    int hours, minutes, seconds, remaining;
    Scanner in = new Scanner(System.in);
    
    System.out.print("No. of seconds?: ");
    seconds = in.nextInt();
    
    hours = seconds/3600;
    minutes = (seconds/60) % 60;
    remaining = seconds%60;
    
    System.out.printf("%d s = %d hr, %d mins, %d s\n", seconds, hours, minutes, remaining);
  }
}
    
    
    