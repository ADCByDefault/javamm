package javamm;

@SuppressWarnings("all")
public class Serpentina {
  public static int[] visitaSerpentina(int[][] M) {
    int i = 0;
    int j = 0;
    int v = 1;
    int[] arr = new int[M[0].length];
    do {
      {
        arr[j] = M[i][j];
        int _length = M.length;
        boolean _greaterEqualsThan = ((i + 1) >= _length);
        if (_greaterEqualsThan) {
          v = -1;
        }
        if (((i - 1) < 0)) {
          v = 1;
        }
        j++;
        int _i = i;
        i = (_i + v);
      }
    } while((j < M[0].length));
    return arr;
  }

  public static void main(String[] args) {
  }
}
