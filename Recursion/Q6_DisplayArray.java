import java.io.*;
import java.util.*;
public class Q6_DisplayArray {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = scn.nextInt();
    }
    displayArr1(a, 0);
    // displayArr2(a, n-1);
  }

  public static void displayArr1(int[] arr, int idx) {
    if (idx == arr.length) {
      return;
    }
    System.out.print(arr[idx] + " ");
    displayArr1(arr, idx + 1);
  }

  public static void displayArr2(int[] arr, int n) {
    if (n < 0) {
      return;
    }
    displayArr2(arr, n-1);
    System.out.print(arr[n] + " ");
  }

}