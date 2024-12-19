package javamm;

@SuppressWarnings("all")
public class GeneraMatriceDaArray {
  public static int[][] generaMatriceDaArray(int[] arr) {
    int righe = GeneraMatriceDaArray.getMax(arr);
    int colonne = GeneraMatriceDaArray.sommatoria(arr);
    int[][] M = new int[righe][colonne];
    int cont = 1;
    int inizio = 0;
    for (int i = 0; (i < arr.length); i++) {
      {
        cont = GeneraMatriceDaArray.riempiAQuadrato(M, cont, inizio, arr[i]);
        int _inizio = inizio;
        inizio = (_inizio + arr[i]);
      }
    }
    return M;
  }

  public static int riempiAQuadrato(int[][] M, int cont, int inizio, int dimensione) {
    for (int i = 0; (i < dimensione); i++) {
      for (int j = 0; (j < dimensione); j++) {
        {
          M[i][(j + inizio)] = cont;
          cont++;
        }
      }
    }
    return cont;
  }

  public static int sommatoria(int[] arr) {
    int acc = 0;
    for (int i = 0; (i < arr.length); i++) {
      int _acc = acc;
      acc = (_acc + arr[i]);
    }
    return acc;
  }

  public static int getMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; (i < arr.length); i++) {
      boolean _lessThan = (max < arr[i]);
      if (_lessThan) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[][] generaMatriceDaArrayRicorsivo(int[] arr) {
    int righe = GeneraMatriceDaArray.getMax(arr);
    int colonne = GeneraMatriceDaArray.sommatoria(arr);
    int[][] M = new int[righe][colonne];
    GeneraMatriceDaArray.ricorsiva(arr, 0, M, 0, 1);
    return M;
  }

  public static void ricorsiva(int[] arr, int i, int[][] M, int inizio, int cont) {
    int _length = arr.length;
    boolean _tripleEquals = (i == _length);
    if (_tripleEquals) {
      return;
    }
    cont = GeneraMatriceDaArray.riempiAQuadrato(M, cont, inizio, arr[i]);
    int _plus = (inizio + arr[i]);
    GeneraMatriceDaArray.ricorsiva(arr, (i + 1), M, _plus, cont);
  }

  public static void main(String[] args) {
    int[][] matrix = GeneraMatriceDaArray.generaMatriceDaArrayRicorsivo(new int[] { 2, 4, 1, 3 });
    for (int i = 0; (i < matrix.length); i++) {
      {
        for (int j = 0; (j < matrix[i].length); j++) {
          String _plus = (Integer.valueOf(matrix[i][j]) + " ");
          System.out.print(_plus);
        }
        System.out.println();
      }
    }
  }
}
