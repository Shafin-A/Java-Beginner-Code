import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

  public static void main(String[] args) {

    Random random = new Random();
    Scanner in = new Scanner(System.in);
    int number = random.nextInt(100) + 1;
    int guess;
    guess = in.nextInt();
    theGuess(guess);
    compareNumbers(guess, number);
}

  public static void theGuess(int guess) {
    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    System.out.print("Type a number: ");
  }

  public static void compareNumbers(int guess, int number) {
    if (guess == number) {
      System.out.println("You win!!!!!");
    } else if (guess < number) {
      System.out.println("Too low. Try again");
      Scanner in = new Scanner(System.in);
      guess = in.nextInt();
      compareNumbers(guess, number);
    } else {
      System.out.println("Too high. Try again");
      Scanner in = new Scanner(System.in);
      guess = in.nextInt();
      compareNumbers(guess, number);
    }
  }
}
