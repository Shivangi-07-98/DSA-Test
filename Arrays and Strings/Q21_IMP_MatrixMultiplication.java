// MEDIUM PRIORITY - Matrix multiplication has been asked at Apple and other companies
// (GeeksforGeeks lists it as top 50 matrix problems)

// 2 matrix bnana 2*3 and 3*4 ans 2*4 ka hoga 
import java.io.*;
import java.util.*;
public class Q21_IMP_MatrixMultiplication {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    // matrix 1
    int n1 = scn.nextInt(); // rows
    int m1 = scn.nextInt(); // columns
    int[][] a1 = new int[n1][m1];
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m1; j++) {
        a1[i][j] = scn.nextInt();
      }
    }
    // matrix 2
    int n2 = scn.nextInt(); // rows
    int m2 = scn.nextInt(); // columns
    int[][] a2 = new int[n2][m2];
    for (int i = 0; i < n2; i++) {
      for (int j = 0; j < m2; j++) {
        a2[i][j] = scn.nextInt();
      }
    }

    // ye rule hai 1st matrix ka column 2nd matrix ke row se match krna chaiye kuki multiply bhi toh aise hi hota hai First matrix ka Sara row second matrix ke saree column se multiply hota hai
    if (m1 != n2) {
      System.out.print("Invalid input");
      return;
      // Main mai return krne se program ends
    }

    int[][] prd = new int[n1][m2]; // ye dry run pr hi pta chlega
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m2; j++) {
        int val = 0;
        for (int k = 0; k < m1; k++) { // main logic of the code 
          val = val + a1[i][k] * a2[k][j];
        }
        prd[i][j] = val;
      }
    }

    display(prd);
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}
