public class bottlesong {
  public static void song(int n) {
    if (n==0) {
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya can't take one down, ya can't pass it around,");
      System.out.println("cause there's no more bottles of beer on the wall.");
    } else {
      System.out.println(n + " bottles of beer on the wall,");
      System.out.println(n + " bottles of beer,");
      System.out.println("take one down, pass it around,");
      System.out.println((n - 1) + " bottles of beer on the wall,");
      song(n - 1);
    }
  }
  public static void main(String[] args) {
    int n = 99;
    song(n);
  }
}
