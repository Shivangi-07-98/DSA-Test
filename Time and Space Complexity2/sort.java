import java.util.*;
public class sort { // 
  
  public static void main(String[] args) {
    int[] arr = {2, 2, 1, 1, 0, 0};

    int i = 0;
    int j = 0;
    int k = arr.length - 1;

    while(i <= k){
      if(arr[i] == 0){
        swap(arr, i, j);
        i++;
        j++;
      }
      else if(arr[i] == 1){
        i++;
      }
      else if(arr[i] == 2){
        swap(arr, i, k);
        k--;
      }
    }

    for (int k2 = 0; k2 < arr.length; k2++) {
      System.out.print(arr[k2] + " ");
    }
    
  }

  public static void swap (int [] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
// Sort an array consisting of only 0s, 1s, and 2s using the Dutch National Flag algorithm.