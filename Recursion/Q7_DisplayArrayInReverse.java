import java.io.*;
import java.util.*;

public class Q7_DisplayArrayInReverse {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = scn.nextInt();
    }
    // displayArrReverse(a, 0);
    displayArr(a, n - 1);
  }

  public static void displayArrReverse(int[] arr, int idx) {
    if (idx == arr.length) {
      return;
    }
    displayArrReverse(arr, idx + 1);
    System.out.print(arr[idx] + " ");
  }

  public static void displayArr(int[] arr, int n) {
    if (n < 0) {
      return;
    }
    System.out.print(arr[n] + " ");
    displayArr(arr, n - 1);
  }

}