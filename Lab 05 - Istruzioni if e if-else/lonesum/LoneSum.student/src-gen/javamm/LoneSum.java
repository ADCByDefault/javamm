package javamm;

@SuppressWarnings("all")
public class LoneSum {
  public static int loneSum(int a, int b, int c) {
    int somma = 0;
    if (((a != b) && (a != c))) {
      int _somma = somma;
      somma = (_somma + a);
    }
    if (((b != a) && (b != c))) {
      int _somma_1 = somma;
      somma = (_somma_1 + b);
    }
    if (((c != a) && (c != b))) {
      int _somma_2 = somma;
      somma = (_somma_2 + c);
    }
    return somma;
  }

  public static void main(String[] args) {
    System.out.println(LoneSum.loneSum(1, 1, 2));
  }
}
