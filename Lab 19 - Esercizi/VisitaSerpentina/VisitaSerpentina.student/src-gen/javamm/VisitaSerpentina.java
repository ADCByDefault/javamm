package javamm;

@SuppressWarnings("all")
public class VisitaSerpentina {
  public static int[] visitaSerpentina(int[][] M, int riga, int colonna) {
    int _length = M.length;
    int _modulo = (_length % 2);
    boolean _tripleEquals = (_modulo == 1);
    if (_tripleEquals) {
      return null;
    }
    int[] arr = new int[(M.length * M[0].length)];
    int move = 1;
    int i = riga;
    int j = (colonna + 1);
    int cont = 1;
    arr[0] = M[i][colonna];
    while (true) {
      {
        while (true) {
          {
            int _length_1 = arr.length;
            boolean _tripleEquals_1 = (cont == _length_1);
            if (_tripleEquals_1) {
              return arr;
            }
            if (((j >= M[0].length) || (j < 0))) {
              break;
            }
            arr[cont] = M[i][j];
            cont = (cont + 1);
            j = (j + move);
          }
        }
        move = (move * -1);
        int _j = j;
        j = (_j + move);
        i++;
        int _length_1 = M.length;
        int _modulo_1 = (i % _length_1);
        i = _modulo_1;
      }
    }
  }

  public static void main(String[] args) {
  }
}
