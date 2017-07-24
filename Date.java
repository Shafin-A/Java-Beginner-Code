import java.util.Scanner;
public class Date {

  public static void printAmer(String day, int date, String month, int year) {
      System.out.println("American Format:");
      System.out.println(day + ", " + month + " " + date + ", " + year);
      }
  
  public static void printEuro(String day, int date, String month, int year) {
      System.out.println("European Format:");
      System.out.println(day + " " + date + " " + month + " " + year);
      }
  
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("What day is it?: ");
      String day = in.nextLine();
      
      System.out.println("What is today's date?: ");
      int date = in.nextInt();
      
      in.nextLine(); //Avoids scanner bug when taking sting input after integer
      
      System.out.println("What month is it?: ");
      String month = in.nextLine();
      
      System.out.println("What year is it?: ");
      int year = in.nextInt();

      printAmer(day, date, month, year);
      printEuro(day, date, month, year);

  }
}
