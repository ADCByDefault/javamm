package javamm;

@SuppressWarnings("all")
public class EspandiArray {
  public static int[][] espandiArray(int[] V) {
    int colonne = V.length;
    int righe = EspandiArray.getMax(V);
    int[][] m = new int[righe][colonne];
    for (int i = 0; (i < m.length); i++) {
      for (int j = 0; (j < m[0].length); j++) {
        {
          m[i][j] = 0;
          boolean _lessThan = (i < V[j]);
          if (_lessThan) {
            m[i][j] = V[j];
          }
        }
      }
    }
    EspandiArray.stampaMat(m);
    return m;
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

  public static void stampaArr(int[] arr) {
    String s = "";
    for (int i = 0; (i < arr.length); i++) {
      String _s = s;
      String _plus = (Integer.valueOf(arr[i]) + "    ");
      s = (_s + _plus);
    }
    System.out.println(("\n" + s));
  }

  public static void stampaMat(int[][] m) {
    for (int i = 0; (i < m.length); i++) {
      EspandiArray.stampaArr(m[i]);
    }
  }

  public static void main(String[] args) {
  }
}
