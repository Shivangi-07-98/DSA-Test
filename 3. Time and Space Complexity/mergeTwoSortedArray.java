import java.util.*;

public class mergeTwoSortedArray {
  public static void main(String[] args) {

    int[] one = { 1, 4, 7, 10, 13, 16, 19, 22 };
    int[] two = { 2, 5, 8, 11, 14, 17, 20, 23, 26, 29 };
    // 1 2 4 5 7 8 10 11 13 14 16 17 19 20 22 23 26 29
    // 1 2 4 5 7 8 10 11 13 14 16 17 19 20 22 23 26 29 

    int [] ans = new int [one.length + two.length];
    
    int i = 0;
    int j = 0;
    int k = 0;

    while(i < one.length && j < two.length){
      if(one[i] < two[j]){
        ans[k] = one[i];
        i++;
        k++;
      }
      else{
        ans[k] = two[j];
        j++;
        k++;
      }
    }

    while(i < one.length){
      ans[k] = one[i];
        i++;
        k++;
    }

    while(j < two.length){
      ans[k] = two[j];
        j++;
        k++;
    }

    for (int x = 0; x < ans.length; x++) {
      System.out.print(ans[x] + " ");
    }


  }
}