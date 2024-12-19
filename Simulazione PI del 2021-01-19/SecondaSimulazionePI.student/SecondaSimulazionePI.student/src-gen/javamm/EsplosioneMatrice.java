package javamm;

@SuppressWarnings("all")
public class EsplosioneMatrice {
  public static int[] cercaIndice(int[][] T, int r, int c) {
    int t = T[r][c];
    T[r][c] = 0;
    int _xjconditionalexpression = (int) 0;
    if ((r > 0)) {
      _xjconditionalexpression = (r - 1);
    } else {
      _xjconditionalexpression = 0;
    }
    int rmin = _xjconditionalexpression;
    int _xjconditionalexpression_1 = (int) 0;
    int _length = T.length;
    int _minus = (_length - 1);
    boolean _lessThan = (r < _minus);
    if (_lessThan) {
      _xjconditionalexpression_1 = (r + 1);
    } else {
      _xjconditionalexpression_1 = r;
    }
    int rmax = _xjconditionalexpression_1;
    int _xjconditionalexpression_2 = (int) 0;
    if ((c > 0)) {
      _xjconditionalexpression_2 = (c - 1);
    } else {
      _xjconditionalexpression_2 = 0;
    }
    int cmin = _xjconditionalexpression_2;
    int _xjconditionalexpression_3 = (int) 0;
    int _length_1 = T[0].length;
    int _minus_1 = (_length_1 - 1);
    boolean _lessThan_1 = (c < _minus_1);
    if (_lessThan_1) {
      _xjconditionalexpression_3 = (c + 1);
    } else {
      _xjconditionalexpression_3 = c;
    }
    int cmax = _xjconditionalexpression_3;
    for (int i = rmax; (i >= rmin); i--) {
      for (int j = cmax; (j >= cmin); j--) {
        boolean _tripleEquals = (T[i][j] == 1);
        if (_tripleEquals) {
          T[r][c] = t;
          return new int[] { i, j };
        }
      }
    }
    return null;
  }

  public static int[][] esplodiMatrice(int[][] T, int r, int c) {
    boolean _tripleEquals = (T[r][c] == 0);
    if (_tripleEquals) {
      return T;
    }
    T[r][c] = 0;
    int[] prossimaCellaEsplosiva = EsplosioneMatrice.cercaIndice(T, r, c);
    if ((prossimaCellaEsplosiva == null)) {
      return T;
    }
    return EsplosioneMatrice.esplodiMatrice(T, prossimaCellaEsplosiva[0], prossimaCellaEsplosiva[1]);
  }

  public static void main(String[] args) {
  }
}
