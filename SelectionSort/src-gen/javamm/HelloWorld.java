package javamm;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class HelloWorld {
  public static void selectionSort(int[] arr) {
    int k = 0;
    int t = 0;
    for (int i = 0; (i < (arr.length - 1)); i++) {
      {
        k = i;
        for (int j = (i + 1); (j < arr.length); j++) {
          boolean _lessThan = (arr[j] < arr[k]);
          if (_lessThan) {
            k = j;
          }
        }
        if ((k != i)) {
          t = arr[k];
          arr[k] = arr[i];
          arr[i] = t;
        }
      }
    }
    System.out.println(((List<Integer>)Conversions.doWrapArray(arr)).toString());
  }

  public static void main(String[] args) {
    HelloWorld.selectionSort(new int[] { 7, 6, 11, 17, 3, 15, 5, 19, 30, 14 });
  }
}
