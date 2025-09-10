// O(n)
// in an unsorted array in O(n) give kth smallest number
// imp remember last element ko pivot maankar partition kar rhe, fir pivot last swap hota hai and i and j dono badhte hai toh pivot j ko peeche krna hoga, pivot j-1 hoga
// logic ye hai ki ek array mai swap krna hai and k jo ki index wise k-1 hoga usko match krenge 
// partition mai jis element ko pivot maankar partition krte logic wise wo correct place par hai kuki uski left chhote ya barabar hai and right bade hai
// bas aise hi krte rehna pivot ka index k se match krana and boom it is the answer

import java.util.*;
public class Q20_QuickSelect {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 8
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 40 60 30 20 90 70 80 50 => 20 30 40 50 60 70 80 90
    }
    int k = scn.nextInt(); // k smallest number
    int ans = QuickSelect(arr, 0, arr.length - 1, k - 1);
    System.out.println(ans);
    // print(arr);
  }

  public static int QuickSelect(int[] arr, int lo, int hi, int k) {
    int pivot = arr[hi];
    int pidx = partition(arr, pivot, lo, hi);

    if (k > pidx) {
      return QuickSelect(arr, pidx + 1, hi, k);
    } else if (k < pidx) {
      return QuickSelect(arr, lo, pidx - 1, k);
    } else {
      return pivot;
    }
  }

  // j-1 is where the pivot is and is on correct spot
  public static int partition(int[] arr, int pivot, int lo, int hi) {
    int i = lo;
    int j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    // j is first of the larger than pivot element
    // pivot lives at j-1
    // left to pivot is all small or equal
    // right to pivot is all larger
    return (j - 1);
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}
