import java.io.*;
import java.util.*;
public class Q16_RotateAnArray {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();

    rotate(arr, k);
    display(arr);
  }

  public static void rotate(int[] a, int k) {
    // write your code here
    k = k % a.length;
    if (k < 0) {
      k = k + a.length;
    }
    reverse(a, 0, a.length - 1 - k);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

  public static void reverse(int[] a, int left, int right) {
    while (left < right) {
      int temp = a[left];
      a[left] = a[right];
      a[right] = temp;

      left++;
      right--;
    }
  }

  public static void display(int[] a) {
    for (int val : a) {
      System.out.print(val + " ");
    }
  }

}
