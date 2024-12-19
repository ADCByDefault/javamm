package javamm;

@SuppressWarnings("all")
public class HelloWorld {
  public static void risolviEq(int a, int b) {
    if ((a == 0)) {
      if ((b == 0)) {
        System.out.println("Eq indeterminata");
        return;
      }
      System.out.println("Eq impossibile");
      return;
    }
    int _minus = (-b);
    int _divide = (_minus / a);
    String _plus = ("sol: " + Integer.valueOf(_divide));
    System.out.println(_plus);
  }

  public static void main(String[] args) {
  }
}
