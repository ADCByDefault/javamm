package javamm;

@SuppressWarnings("all")
public class TestBilanciamento {
  /**
   * boolean testBilanciamento(int[] arr) {
   * 
   * 	if(arr.length == 0 || arr.length % 2 != 0) return false;
   * 
   * 	if(arr.length == 2) return arr[0] == arr[1];
   * 
   * 	int b = arr[0] + arr[arr.length - 1];
   * 	for (int i = 0; i < arr.length / 2; i++) {
   * 		if(arr[i] + arr[arr.length - i - 1] != b) return false;
   * 	}
   * 
   * 	return true;
   * }
   */
  public static boolean testBilanciamento(int[] arr) {
    if (((arr.length == 0) || ((arr.length % 2) != 0))) {
      return false;
    }
    int _length = arr.length;
    boolean _tripleEquals = (_length == 2);
    if (_tripleEquals) {
      return (arr[0] == arr[1]);
    }
    int b = (arr[0] + arr[(arr.length - 1)]);
    int _length_1 = arr.length;
    int _minus = (_length_1 - 1);
    return TestBilanciamento.isBilanciato(arr, 0, _minus, b);
  }

  public static boolean isBilanciato(int[] arr, int left, int right, int num) {
    if ((left >= right)) {
      return true;
    }
    int _plus = (arr[left] + arr[right]);
    boolean _tripleEquals = (_plus == num);
    if (_tripleEquals) {
      return TestBilanciamento.isBilanciato(arr, (left + 1), (right - 1), num);
    }
    return false;
  }

  public static void main(String[] args) {
  }
}
