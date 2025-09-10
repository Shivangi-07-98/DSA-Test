import java.util.*;
public class Q25_NQueens {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 4 square matrix
    int[][] arr = new int[n][n];
    printNQueens(arr, "", 0);
  }

  public static void printNQueens(int[][] arr, String qsf, int row) {
    if (row == arr.length) {
      System.out.println(qsf);
      return;
    }
    for (int col = 0; col < arr.length; col++) {
      if (isItSafeForTheQueen(arr, row, col) == true) {
        arr[row][col] = 1;
        printNQueens(arr, qsf + row + "-" + col + ", ", row + 1);
        arr[row][col] = 0;
      }
    }
  }

  public static boolean isItSafeForTheQueen(int[][] arr, int r, int c) {
    for (int i = r - 1, j = c; i >= 0; i--) { // for future queens to be placed it will look behind for danger, no danger aage or on same row, only danger is behind. straight line 
      if (arr[i][j] > 0) { // why greater than 0 because 1 is where queen is placed
        return false;
      }
    }

    for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) { // left diagonal danger 
      if (arr[i][j] > 0) {
        return false;
      }
    }

    for (int i = r - 1, j = c + 1; i >= 0 && j < arr.length; i--, j++) { // right diagonal danger
      if (arr[i][j] > 0) {
        return false;
      }
    }

    return true;
  }

}
// 4*4 board ke chess pr 4 queen ko place krna hai taki wo ek dusre ko kill na kr ske
// queen moves in all 8 direction any number of move
// 4*4 4 queens
// 5*5 5 queens
// 6*6 6 queens

// hint - har row mai 1 queen hogi, no row would be empty
// 