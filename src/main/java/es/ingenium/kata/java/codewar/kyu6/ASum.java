package es.ingenium.kata.java.codewar.kyu6;

/**
 * Read exercise description on {@link es.ingenium.kata.java.codewar.kyu6.ASumTest}
 * 
 * <br>
 * <p>
 * Original code:
 * </p>
 * <p>
 * <code><blockquote>
 * public class ASum { <br>public static long findNb(long m) {} <br>}
 * </blockquote></code>
 * </p>
 * <br>
 */
public class ASum {

  public static long findNb(long m) {
    System.out.println("findNb with value: [m=" + m + "].");
    long number = -1;

    if (m == 0) {
      return number;
    } else if (m == 1) {
      return m; // case n=1
    } else { // case n>1
      Long tempResult = 0L;
      int n = 1;
      boolean goOn = Boolean.TRUE;
      while (goOn) {
        n++;

        tempResult = calculateSumOfThirdPower(n);

        if (tempResult.compareTo(m) < 0) {
          goOn = Boolean.TRUE;
        } else {
          goOn = Boolean.FALSE;
          if (tempResult.compareTo(m) == 0) {
            number = n;
          }
        }

      }

      System.out.println("Maximum checked value: [n=" + n + "].");

      return number;
    }
  }


  /**
   * @param n
   * @return the value resulting from the sum <br>
   * 
   * @info Step by step: <br>
   *       n=2<br>
   *       (2-0)^3 + (2-1)^3 <br>
   *       n=3<br>
   *       (3-0)^3 + (3-1)^3 + (3-2)^3 <br>
   *       n=4<br>
   *       (4-0)^3 + (4-1)^3 + (4-2)^3 + (4-3)^3 <br>
   *       ...<br>
   *       n=n<br>
   *       (n-0)^3 + (n-1)^3 + ... + (n-n+1)^3<br>
   * 
   */
  private static long calculateSumOfThirdPower(int n) {
    long tempResult = 0L;

    for (int x = 0; x < n; x++) {
      tempResult += Math.pow(n - x, 3);
    }

    return tempResult;
  }
}
