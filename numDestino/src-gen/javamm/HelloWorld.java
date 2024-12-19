package javamm;

@SuppressWarnings("all")
public class HelloWorld {
  public static int destino(int n) {
    if ((n < 10)) {
      return n;
    }
    int somma = HelloWorld.sommaCifre(n);
    return HelloWorld.destino(somma);
  }

  public static int sommaCifre(int n) {
    int somma = 0;
    while ((n > 0)) {
      {
        int _somma = somma;
        somma = (_somma + (n % 10));
        int _n = n;
        n = (_n / 10);
      }
    }
    return somma;
  }

  public static void main(String[] args) {
    System.out.println(HelloWorld.destino(21061961));
  }
}
