package javamm;

@SuppressWarnings("all")
public class FirstLastDigitSum {
  public static int firstLastDigitSum(int n) {
    char _charAt = (Integer.valueOf(n) + "").charAt(0);
    String _plus = (Character.valueOf(_charAt) + "");
    int _parseInt = Integer.parseInt(_plus);
    int _length = (Integer.valueOf(n) + "").length();
    int _minus = (_length - 1);
    char _charAt_1 = (Integer.valueOf(n) + "").charAt(_minus);
    String _plus_1 = (Character.valueOf(_charAt_1) + "");
    int _parseInt_1 = Integer.parseInt(_plus_1);
    return (_parseInt + _parseInt_1);
  }

  public static void main(String[] args) {
  }
}
