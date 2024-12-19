package javamm;

@SuppressWarnings("all")
public class IntegerSquareRoot {
  public static int integerSquareRoot(int n) {
    int x = 0;
    while (((x * x) <= n)) {
      x++;
    }
    return --x;
  }

  public static void main(String[] args) {
    System.out.println(IntegerSquareRoot.integerSquareRoot(13));
    System.out.println(IntegerSquareRoot.integerSquareRoot(25));
    System.out.println(IntegerSquareRoot.integerSquareRoot(5));
  }
}
