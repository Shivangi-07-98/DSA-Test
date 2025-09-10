// O(n)
import java.util.*;
public class Q5_Polynomial {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt(); // 10
    int n = scn.nextInt(); // 3

    // Polynomial eqn: nx^1 + (n-1)x^2 + (n-2)x^3 + ... + 3x^(n-2) + 2x^(n-1) + 1x^n
    // 3*x¹ + 2*x² + 1*x³
    // 3*2 + 2*4 + 1*8 = 6 + 8 + 8 = 22

    // Approach 1: nx¹ + (n-1)x² + (n-2)x³ + ... + 1xⁿ
    int c = n;
    int pox = x;
    int ans = 0;
    while (c >= 1) {
      int term = c * pox; // nx^1
      ans += term;
      pox = pox * x; // for x^2 and so on
      c--;
    }
    System.out.println(ans);

    // Approach 2: 1xⁿ + 2xⁿ⁻¹ + 3xⁿ⁻² + ... + nx¹
    int a = 1;
    int term = 0;
    while (n >= 1) {
      term = term + a * (int) Math.pow(x, n);
      a++;
      n--;
    }
    System.out.println(term);
  }
}
