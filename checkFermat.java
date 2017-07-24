import java.util.Scanner;

public class checkFermat {
  public static void checkFermat(int a, int b, int c, int n) {

    if (n>2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)) {
      System.out.println("Holy smokes! Fermat was wrong!");
    } else if (n<=2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)) {
      System.out.println("This doesn't disprove Fermat's Last Theorem.");
    } else {
      System.out.println("No, that doesn't work.");
    }
  }
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  System.out.println("Enter the value of 'a' in a^n + b^n = c^n.");
  int a = in.nextInt();
  System.out.println("Enter the value of 'b' in a^n + b^n = c^n.");
  int b = in.nextInt();
  System.out.println("Enter the value of 'c' in a^n + b^n = c^n.");
  int c = in.nextInt();
  System.out.println("Enter the value of 'n' in a^n + b^n = c^n.");
  int n = in.nextInt();

  checkFermat(a,b,c,n);
}
}
