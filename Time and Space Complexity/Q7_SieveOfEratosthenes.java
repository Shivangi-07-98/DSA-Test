// O(n log(logn))
// Better time complexity than print all primes O( n*rt(n) )
import java.util.*;
public class Q7_SieveOfEratosthenes {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 30

    boolean[] arr = new boolean[n + 1]; // boolean array 31 to store 0-30
    // int [] arr = new int [n+1]; // integer array

    for (int i = 2; i * i < arr.length; i++) { // 2, 3, 4, 5
      if (arr[i] == false) { // checks for 2, 3, 5 then enters loop
        for (int j = i; i * j < arr.length; j++) {
          arr[i * j] = true; // 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 9, 15, 21, 27, 25
        }
      }
    }

    for (int i = 2; i < arr.length; i++) {
      if (arr[i] == false) {
        System.out.print(i + " ");
      }
    }

  }
}

// n = 10^8
// rt(n) = 10^4
// log n = 27
// log(logn) = 5
