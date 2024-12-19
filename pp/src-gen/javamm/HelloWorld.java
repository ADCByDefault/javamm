package javamm;

@SuppressWarnings("all")
public class HelloWorld {
  public static void main(String[] args) {
    int[][] board = new int[8][8];
    int black = 1;
    int white = 2;
    int playerRows = 3;
    for (int i = 0; (i < board.length); i++) {
      {
        int pos = 0;
        if (((i % 2) != 0)) {
          pos = 1;
        }
        int p = 0;
        if ((i < playerRows)) {
          p = black;
        }
        int _length = board.length;
        int _minus = (_length - playerRows);
        boolean _greaterEqualsThan = (i >= _minus);
        if (_greaterEqualsThan) {
          p = white;
        }
        for (int j = 0; (j < board[i].length); j++) {
          if ((pos == j)) {
            board[i][j] = p;
            int _pos = pos;
            pos = (_pos + 2);
          } else {
            board[i][j] = 0;
          }
        }
      }
    }
    for (int i = 0; (i < board.length); i++) {
      {
        System.out.println("\n");
        String s = "";
        for (int j = 0; (j < board[i].length); j++) {
          String _s = s;
          String _plus = (Integer.valueOf(board[i][j]) + "   ");
          s = (_s + _plus);
        }
        System.out.println(s);
      }
    }
  }
}
