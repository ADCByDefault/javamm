package javamm;

@SuppressWarnings("all")
public class Intero {
  public static boolean bilanciato(int n) {
    int right = 0;
    int _size = Intero.getSize(n);
    int left = (_size - 1);
    if ((left == 1)) {
      return ((n % 10) == (n / 10));
    }
    if (((left % 2) == 0)) {
      return false;
    }
    int _nthCifra = Intero.getNthCifra(left, n);
    int _nthCifra_1 = Intero.getNthCifra(right, n);
    int fattore = (_nthCifra + _nthCifra_1);
    while ((left > right)) {
      {
        int _nthCifra_2 = Intero.getNthCifra(left, n);
        int _nthCifra_3 = Intero.getNthCifra(right, n);
        int _plus = (_nthCifra_2 + _nthCifra_3);
        boolean _tripleNotEquals = (_plus != fattore);
        if (_tripleNotEquals) {
          return false;
        }
        left--;
        right++;
      }
    }
    return true;
  }

  public static int getSize(int n) {
    if ((n == 0)) {
      return 1;
    }
    int cont = 0;
    while ((n != 0)) {
      {
        cont++;
        n = (n / 10);
      }
    }
    return cont;
  }

  public static int getNthCifra(int n, int num) {
    double _pow = Math.pow(10, n);
    int i = ((int) _pow);
    num = (num / i);
    i = (num % 10);
    return i;
  }

  public static void main(String[] args) {
    System.out.println(Intero.bilanciato(4220));
  }
}
