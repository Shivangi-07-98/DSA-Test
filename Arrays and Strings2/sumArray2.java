import java.util.*;
public class sumArray2 {
  public static void main (String[] args){
    int[] arr = {1, 4, 20, 3, 10, 5, 13, 7, 10, 15, 8};
    int sum = 33;

    for(int i = 0; i < arr.length; i++){
      int newSum = 0;
      for(int j = i; j < arr.length; j++){
        newSum += arr[j];
        if(sum == newSum){
          for(int k = i; k <= j; k++){
            System.out.print(arr[k] + " ");
          }
          System.out.println();
          // return;
        }
      }
    }


  }
}