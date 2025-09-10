import java.io.*;
import java.util.*;

public class Q8_MaxOfAnArray {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = scn.nextInt();
    }
    
    int ans = maxOfArray(a, 0);
    int ans2 = maxOfArray2(a, n-1);
    System.out.println(ans);
    System.out.println(ans2);
  }

  public static int maxOfArray(int[] arr, int idx) {
    if(idx == arr.length -1){
      return arr[idx];
    }
    int max = maxOfArray(arr, idx + 1);
    if(arr[idx] > max){
      max = arr[idx];
    }
    return max;
  }

  public static int maxOfArray2(int[] arr, int n) {
    if(n == 0){
      return arr[n];
    }
    int max = maxOfArray2(arr, n-1);
    if(arr[n] > max){
      max = arr[n];
    }
    return max;
  }
}