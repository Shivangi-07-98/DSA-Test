import java.util.*;
public class move0toend {
public static void main(String[] args) {
  int [] arr = {0,1,0,3,12}; // 1 3 12 0 0 

  int i = arr.length-1;
  int j = arr.length-1;
  while(j >= 0){
    if(arr[j] != 0){
      j--;
    }
    else{
      swap(arr, i, j);
      i--;
      j--;
    }
  }

  for(int x = 0; x < arr.length; x++){
      System.out.print(arr[x] + " ");
  }
}

public static void swap(int[]arr, int i, int j){
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}
  
}
// [0,1,0,3,12]
// Move all zeros to the end