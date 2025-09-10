// O(2^n)
// 0 1 1 2 3 5 8 13 21 34 55
// 0 1 2 3 4 5 6 7  8  9  10
import java.util.*;

public class Q4_fib {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    // Print entire Fibonacci series from 0 to n
    for(int i = 0; i <= n; i++) {
        System.out.print(fib(i) + " ");
    }
  }

  public static int fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int fibnm1 = fib(n - 1);
    int fibnm2 = fib(n - 2);
    
    int fibn = fibnm1 + fibnm2;
    return fibn;
  }
}
