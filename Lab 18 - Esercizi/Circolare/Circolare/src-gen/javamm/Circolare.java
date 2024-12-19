package javamm;

@SuppressWarnings("all")
public class Circolare {
  public static boolean circolare(char[][] M) {
    int i = 0;
    int j = 0;
    int _length = M.length;
    int _length_1 = M[0].length;
    int cont = (_length * _length_1);
    while (true) {
      {
        char c = M[i][j];
        M[i][j] = 'V';
        switch (c) {
          case 'A':
            i--;
            break;
          case 'B':
            i++;
            break;
          case 'S':
            j--;
            break;
          case 'D':
            j++;
            break;
        }
        if ((i < 0)) {
          int _length_2 = M.length;
          int _minus = (_length_2 - 1);
          i = _minus;
        }
        if ((j < 0)) {
          int _length_3 = M[0].length;
          int _minus_1 = (_length_3 - 1);
          j = _minus_1;
        }
        int _length_4 = M.length;
        int _modulo = (i % _length_4);
        i = _modulo;
        int _length_5 = M[0].length;
        int _modulo_1 = (j % _length_5);
        j = _modulo_1;
        cont--;
        if ((((i == 0) && (j == 0)) && (cont == 0))) {
          return true;
        }
        boolean _tripleEquals = (M[i][j] == 'V');
        if (_tripleEquals) {
          return false;
        }
      }
    }
  }

  public static boolean circolareInversa(char[][] M) {
    int i = 0;
    int j = 0;
    int _length = M.length;
    int _length_1 = M[0].length;
    int cont = (_length * _length_1);
    while (true) {
      {
        char c = M[i][j];
        M[i][j] = 'V';
        switch (c) {
          case 'A':
            i++;
            break;
          case 'B':
            i--;
            break;
          case 'S':
            j++;
            break;
          case 'D':
            j--;
            break;
        }
        if ((i < 0)) {
          int _length_2 = M.length;
          int _minus = (_length_2 - 1);
          i = _minus;
        }
        if ((j < 0)) {
          int _length_3 = M[0].length;
          int _minus_1 = (_length_3 - 1);
          j = _minus_1;
        }
        int _length_4 = M.length;
        int _modulo = (i % _length_4);
        i = _modulo;
        int _length_5 = M[0].length;
        int _modulo_1 = (j % _length_5);
        j = _modulo_1;
        cont--;
        if ((((i == 0) && (j == 0)) && (cont == 0))) {
          return true;
        }
        boolean _tripleEquals = (M[i][j] == 'V');
        if (_tripleEquals) {
          return false;
        }
      }
    }
  }

  public static void main(String[] args) {
  }
}
