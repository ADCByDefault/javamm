package javamm;

@SuppressWarnings("all")
public class Intero {
  public static int comprimi(int n, byte k) {
    int numCompresso = 0;
    int sommaGruppo = 0;
    int cont = 0;
    while ((n > 0)) {
      {
        double _pow = Math.pow(10, k);
        int _modulo = (n % ((int) _pow));
        sommaGruppo = Intero.sommaValori(_modulo);
        double _pow_1 = Math.pow(10, k);
        int _divide = (n / ((int) _pow_1));
        n = _divide;
        double _pow_2 = Math.pow(10, cont);
        int _multiply = (sommaGruppo * ((int) _pow_2));
        int _plus = (numCompresso + _multiply);
        numCompresso = _plus;
        int _cont = cont;
        int _contaCifre = Intero.contaCifre(sommaGruppo);
        cont = (_cont + _contaCifre);
      }
    }
    return numCompresso;
  }

  public static int sommaValori(int n) {
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

  public static int contaCifre(int n) {
    if ((n == 0)) {
      return 1;
    }
    int cont = 0;
    while ((n > 0)) {
      {
        int _n = n;
        n = (_n / 10);
        cont++;
      }
    }
    return cont;
  }

  public static void main(String[] args) {
  }
}
