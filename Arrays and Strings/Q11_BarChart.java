import java.io.*;
import java.util.*;
public class Q11_BarChart {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = scn.nextInt();
    }

    // [ 5 6 9 7 2]

    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }

    // max = 9

    for(int i = max; i >= 1; i--){
      for(int j = 0; j < a.length; j++){
        if(a[j] >= i){
          System.out.print("*\t");
        }
        else{
          System.out.print("\t");
        }
      }
      System.out.println();
    }

    
  }

}