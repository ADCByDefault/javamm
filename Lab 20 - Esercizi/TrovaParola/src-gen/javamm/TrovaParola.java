package javamm;

@SuppressWarnings("all")
public class TrovaParola {
  public static boolean trovaParolaDiagonale(char[][] M, char[] p) {
    int[] c = { 0, 0, 0, 0 };
    int[] ic = { 0, 0, 0, 0 };
    int[] ibs = { 0, 0 };
    int[] ibd = { 0, 0 };
    int[] ias = { 0, 0 };
    int[] iad = { 0, 0 };
    for (int i = 0; (i < M[0].length); i++) {
      {
        c = new int[] { 0, 0, 0, 0 };
        ic = new int[] { 0, 0, 0, 0 };
        ibs = new int[] { 0, i };
        ibd = new int[] { 0, i };
        int _length = M.length;
        int _minus = (_length - 1);
        ias = new int[] { _minus, i };
        int _length_1 = M.length;
        int _minus_1 = (_length_1 - 1);
        iad = new int[] { _minus_1, i };
        for (int j = 0; (j < M.length); j++) {
          {
            boolean _esiste = TrovaParola.esiste(M, ibd);
            if (_esiste) {
              char _get = TrovaParola.get(M, ibd);
              boolean _tripleNotEquals = (_get != p[c[0]]);
              if (_tripleNotEquals) {
                c[0] = 0;
              }
              char _get_1 = TrovaParola.get(M, ibd);
              boolean _tripleNotEquals_1 = (_get_1 != p[((p.length - 1) - ic[0])]);
              if (_tripleNotEquals_1) {
                ic[0] = 0;
              }
              char _get_2 = TrovaParola.get(M, ibd);
              boolean _tripleEquals = (_get_2 == p[c[0]]);
              if (_tripleEquals) {
                c[0]++;
              }
              char _get_3 = TrovaParola.get(M, ibd);
              boolean _tripleEquals_1 = (_get_3 == p[((p.length - 1) - ic[0])]);
              if (_tripleEquals_1) {
                ic[0]++;
              }
            } else {
              c[0] = 0;
              ic[0] = 0;
            }
            int _plus = (ibd[0] + 1);
            int _plus_1 = (ibd[1] + 1);
            ibd = new int[] { _plus, _plus_1 };
            boolean _esiste_1 = TrovaParola.esiste(M, ibs);
            if (_esiste_1) {
              char _get_4 = TrovaParola.get(M, ibs);
              boolean _tripleNotEquals_2 = (_get_4 != p[c[1]]);
              if (_tripleNotEquals_2) {
                c[1] = 0;
              }
              char _get_5 = TrovaParola.get(M, ibs);
              boolean _tripleNotEquals_3 = (_get_5 != p[((p.length - 1) - ic[1])]);
              if (_tripleNotEquals_3) {
                ic[1] = 0;
              }
              char _get_6 = TrovaParola.get(M, ibs);
              boolean _tripleEquals_2 = (_get_6 == p[c[1]]);
              if (_tripleEquals_2) {
                c[1]++;
              }
              char _get_7 = TrovaParola.get(M, ibs);
              boolean _tripleEquals_3 = (_get_7 == p[((p.length - 1) - ic[1])]);
              if (_tripleEquals_3) {
                ic[1]++;
              }
            } else {
              c[1] = 0;
              ic[1] = 0;
            }
            int _plus_2 = (ibs[0] + 1);
            int _minus_2 = (ibs[1] - 1);
            ibs = new int[] { _plus_2, _minus_2 };
            boolean _esiste_2 = TrovaParola.esiste(M, ias);
            if (_esiste_2) {
              char _get_8 = TrovaParola.get(M, ias);
              boolean _tripleNotEquals_4 = (_get_8 != p[c[3]]);
              if (_tripleNotEquals_4) {
                c[3] = 0;
              }
              char _get_9 = TrovaParola.get(M, ias);
              boolean _tripleNotEquals_5 = (_get_9 != p[((p.length - 1) - ic[3])]);
              if (_tripleNotEquals_5) {
                ic[3] = 0;
              }
              char _get_10 = TrovaParola.get(M, ias);
              boolean _tripleEquals_4 = (_get_10 == p[c[3]]);
              if (_tripleEquals_4) {
                c[3]++;
              }
              char _get_11 = TrovaParola.get(M, ias);
              boolean _tripleEquals_5 = (_get_11 == p[((p.length - 1) - ic[3])]);
              if (_tripleEquals_5) {
                ic[3]++;
              }
            } else {
              c[3] = 0;
              ic[3] = 0;
            }
            int _minus_3 = (ias[0] - 1);
            int _minus_4 = (ias[1] - 1);
            ias = new int[] { _minus_3, _minus_4 };
            boolean _esiste_3 = TrovaParola.esiste(M, iad);
            if (_esiste_3) {
              char _get_12 = TrovaParola.get(M, iad);
              boolean _tripleNotEquals_6 = (_get_12 != p[c[2]]);
              if (_tripleNotEquals_6) {
                c[2] = 0;
              }
              char _get_13 = TrovaParola.get(M, iad);
              boolean _tripleNotEquals_7 = (_get_13 != p[((p.length - 1) - ic[2])]);
              if (_tripleNotEquals_7) {
                ic[2] = 0;
              }
              char _get_14 = TrovaParola.get(M, iad);
              boolean _tripleEquals_6 = (_get_14 == p[c[2]]);
              if (_tripleEquals_6) {
                c[2]++;
              }
              char _get_15 = TrovaParola.get(M, iad);
              boolean _tripleEquals_7 = (_get_15 == p[((p.length - 1) - ic[2])]);
              if (_tripleEquals_7) {
                ic[2]++;
              }
            } else {
              c[2] = 0;
              ic[2] = 0;
            }
            int _minus_5 = (iad[0] - 1);
            int _plus_3 = (iad[1] + 1);
            iad = new int[] { _minus_5, _plus_3 };
            if (((((c[0] == p.length) || (c[1] == p.length)) || (ic[0] == p.length)) || (ic[1] == p.length))) {
              return true;
            }
            if (((((c[2] == p.length) || (c[3] == p.length)) || (ic[2] == p.length)) || (ic[3] == p.length))) {
              return true;
            }
          }
        }
      }
    }
    for (int i = M[0].length; (i < M.length); i++) {
      {
        c = new int[] { 0, 0, 0, 0 };
        ic = new int[] { 0, 0, 0, 0 };
        iad = new int[] { i, 0 };
        ibd = new int[] { i, 0 };
        int _length = M[0].length;
        int _minus = (_length - 1);
        ias = new int[] { i, _minus };
        int _length_1 = M[0].length;
        int _minus_1 = (_length_1 - 1);
        ibs = new int[] { i, _minus_1 };
        for (int j = 0; (j < M[0].length); j++) {
          {
            boolean _esiste = TrovaParola.esiste(M, iad);
            if (_esiste) {
              char _get = TrovaParola.get(M, iad);
              boolean _tripleNotEquals = (_get != p[c[2]]);
              if (_tripleNotEquals) {
                c[2] = 0;
              }
              char _get_1 = TrovaParola.get(M, iad);
              boolean _tripleNotEquals_1 = (_get_1 != p[((p.length - 1) - ic[2])]);
              if (_tripleNotEquals_1) {
                ic[2] = 0;
              }
              char _get_2 = TrovaParola.get(M, iad);
              boolean _tripleEquals = (_get_2 == p[c[2]]);
              if (_tripleEquals) {
                c[2]++;
              } else {
                c[2] = 0;
              }
              char _get_3 = TrovaParola.get(M, iad);
              boolean _tripleEquals_1 = (_get_3 == p[((p.length - 1) - ic[2])]);
              if (_tripleEquals_1) {
                ic[2]++;
              } else {
                ic[2] = 0;
              }
            } else {
              c[2] = 0;
              ic[2] = 0;
            }
            int _minusMinus = iad[0]--;
            int _plusPlus = iad[1]++;
            iad = new int[] { _minusMinus, _plusPlus };
            boolean _esiste_1 = TrovaParola.esiste(M, ibd);
            if (_esiste_1) {
              char _get_4 = TrovaParola.get(M, ibd);
              boolean _tripleNotEquals_2 = (_get_4 != p[c[0]]);
              if (_tripleNotEquals_2) {
                c[0] = 0;
              }
              char _get_5 = TrovaParola.get(M, ibd);
              boolean _tripleNotEquals_3 = (_get_5 != p[((p.length - 1) - ic[0])]);
              if (_tripleNotEquals_3) {
                ic[0] = 0;
              }
              char _get_6 = TrovaParola.get(M, ibd);
              boolean _tripleEquals_2 = (_get_6 == p[c[0]]);
              if (_tripleEquals_2) {
                c[0]++;
              } else {
                c[0] = 0;
              }
              char _get_7 = TrovaParola.get(M, ibd);
              boolean _tripleEquals_3 = (_get_7 == p[((p.length - 1) - ic[0])]);
              if (_tripleEquals_3) {
                ic[0]++;
              } else {
                ic[0] = 0;
              }
            } else {
              c[0] = 0;
              ic[0] = 0;
            }
            int _plusPlus_1 = ibd[0]++;
            int _plusPlus_2 = ibd[1]++;
            ibd = new int[] { _plusPlus_1, _plusPlus_2 };
            boolean _esiste_2 = TrovaParola.esiste(M, ias);
            if (_esiste_2) {
              char _get_8 = TrovaParola.get(M, ias);
              boolean _tripleNotEquals_4 = (_get_8 != p[c[3]]);
              if (_tripleNotEquals_4) {
                c[3] = 0;
              }
              char _get_9 = TrovaParola.get(M, ias);
              boolean _tripleNotEquals_5 = (_get_9 != p[((p.length - 1) - ic[3])]);
              if (_tripleNotEquals_5) {
                ic[3] = 0;
              }
              char _get_10 = TrovaParola.get(M, ias);
              boolean _tripleEquals_4 = (_get_10 == p[c[3]]);
              if (_tripleEquals_4) {
                c[3]++;
              } else {
                c[3] = 0;
              }
              char _get_11 = TrovaParola.get(M, ias);
              boolean _tripleEquals_5 = (_get_11 == p[((p.length - 1) - ic[3])]);
              if (_tripleEquals_5) {
                ic[3]++;
              } else {
                ic[3] = 0;
              }
            } else {
              c[3] = 0;
              ic[3] = 0;
            }
            int _minusMinus_1 = iad[0]--;
            int _minusMinus_2 = iad[1]--;
            ias = new int[] { _minusMinus_1, _minusMinus_2 };
            boolean _esiste_3 = TrovaParola.esiste(M, ibs);
            if (_esiste_3) {
              char _get_12 = TrovaParola.get(M, ibs);
              boolean _tripleNotEquals_6 = (_get_12 != p[c[1]]);
              if (_tripleNotEquals_6) {
                c[1] = 0;
              }
              char _get_13 = TrovaParola.get(M, ibs);
              boolean _tripleNotEquals_7 = (_get_13 != p[((p.length - 1) - ic[1])]);
              if (_tripleNotEquals_7) {
                ic[1] = 0;
              }
              char _get_14 = TrovaParola.get(M, ibs);
              boolean _tripleEquals_6 = (_get_14 == p[c[1]]);
              if (_tripleEquals_6) {
                c[1]++;
              } else {
                c[1] = 0;
              }
              char _get_15 = TrovaParola.get(M, ibs);
              boolean _tripleEquals_7 = (_get_15 == p[((p.length - 1) - ic[1])]);
              if (_tripleEquals_7) {
                ic[1]++;
              } else {
                ic[1] = 0;
              }
            } else {
              c[1] = 0;
              ic[1] = 0;
            }
            int _plusPlus_3 = ibs[0]++;
            int _minusMinus_3 = ibs[1]--;
            ibs = new int[] { _plusPlus_3, _minusMinus_3 };
            if (((((c[0] == p.length) || (c[1] == p.length)) || (ic[0] == p.length)) || (ic[1] == p.length))) {
              return true;
            }
            if (((((c[2] == p.length) || (c[3] == p.length)) || (ic[2] == p.length)) || (ic[3] == p.length))) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  public static char get(char[][] M, int[] i) {
    return M[i[0]][i[1]];
  }

  public static boolean esiste(char[][] M, int[] i) {
    boolean _not = (!((((i[0] < 0) || (i[0] >= M.length)) || (i[1] < 0)) || (i[1] >= M[0].length)));
    return _not;
  }

  public static void main(String[] args) {
  }
}
