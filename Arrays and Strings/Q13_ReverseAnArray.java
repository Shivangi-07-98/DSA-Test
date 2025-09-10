import java.io.*;
import java.util.*;
public class Q13_ReverseAnArray{

  public static void display(int[] arr){
    for(int val: arr){
      System.out.print(val + " ");
    }
  }

  public static void reverse(int[] a){
    int left = 0;
    int right = a.length - 1;
    
    while (left < right){
         int temp = a[left];
         a[left] = a[right];
         a[right] = temp;
        
        left++;
        right--;
    }
  }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for (int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }

    reverse(arr);
    display(arr);
 }

}