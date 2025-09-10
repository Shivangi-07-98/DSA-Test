import java.util.*;
public class Q24_KnightsTour {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int sz = scn.nextInt(); // 5 square matrix
    int r = scn.nextInt(); // 2 initial location
    int c = scn.nextInt(); // 0 initial location
    int[][] arr = new int[sz][sz];
    printKnightsTour(arr, r, c, 1);
  }

  public static void printKnightsTour(int[][] arr, int r, int c, int upcomingMove) {
    if (r < 0 || c < 0 || r >= arr.length || c >= arr.length || arr[r][c] != 0) { // This not equals to zero check should be at the end because it will give exception error Why Because if r and c is negative it is still a non zero and that's why I'm moving this to last so that when all the out of array move is avoided then it will check this
      return;
    } else if (upcomingMove == arr.length * arr.length) { // for last move 
      arr[r][c] = upcomingMove;
      displayBoard(arr);
      arr[r][c] = 0; // if this is not written only one answer will come because if it is non zero we will not go there, we only go when it is zero
      // also when we backtrack we are exploring other paths while backtracking only, so we have to make it zero to explore other paths
      return;
    }

    arr[r][c] = upcomingMove;
    printKnightsTour(arr, r - 2, c + 1, upcomingMove + 1);
    printKnightsTour(arr, r - 1, c + 2, upcomingMove + 1);
    printKnightsTour(arr, r + 1, c + 2, upcomingMove + 1);
    printKnightsTour(arr, r + 2, c + 1, upcomingMove + 1);
    printKnightsTour(arr, r + 2, c - 1, upcomingMove + 1);
    printKnightsTour(arr, r + 1, c - 2, upcomingMove + 1);
    printKnightsTour(arr, r - 1, c - 2, upcomingMove + 1);
    printKnightsTour(arr, r - 2, c - 1, upcomingMove + 1);
    arr[r][c] = 0; // because if it is non zero we will not go there, we only go when it is zero
  }

  public static void displayBoard(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

}
// knight dhai kadam chlta hai 2.5
// knights all moves so that he visit all cells without visiting any cell twice
// knight ke dhai kadam possibility 8 hai
// for eg- agar wo r,c par hai toh 8 moves possible hai
// r-2,c+1
// r-1,c+2
// r+1,c+2
// r+2,c+1
// r+2,c-1
// r+1,c-2
// r-1,c-2
// r-2,c-1

// answer aayega 5*5 ke matrix mai (1-25 moves in order 1st move 2nd 3rd and so on)
// 5*5 matrix 2-3 baar aa skta jitne answers possible hai
// 