import java.io.*;
import java.util.*;
public class Q3_Powerlogarithmic {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int ans = power(x, n);
    System.out.println(ans);
  }

  public static int power(int x, int n) {
    if (n == 0) {
      return 1; // 2^0 = 1
    }
    int a = power(x, n / 2);
    int b = a * a;
    // If n is odd, multiply by x once more
    if (n % 2 == 1) {
      b = b * x;
    }
    return b;
  }

}
// 1/2 = 0 in java
// 1/4 = 0