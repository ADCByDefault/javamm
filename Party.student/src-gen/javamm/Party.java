package javamm;

@SuppressWarnings("all")
public class Party {
  public static boolean party(int c, boolean s) {
    return ((s && (c <= 100)) || ((!s) && (c <= 40)));
  }

  public static void main(String[] args) {
  }
}
