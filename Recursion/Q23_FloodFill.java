import java.util.*;
public class Q23_FloodFill {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // 2d array fill with 0 and 1
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    boolean[][] visited = new boolean[arr.length][arr[0].length];
    FloodFill(arr, visited, 0, 0, " ");
  }

  public static void FloodFill(int[][] arr, boolean[][] visited, int sr, int sc, String asf) {
    if (sr == arr.length || sc == arr[0].length || sr == -1 || sc == -1 || arr[sr][sc] == 1
        || visited[sr][sc] == true) {
      return;
    } else if (sr == arr.length - 1 && sc == arr[0].length - 1) {
      System.out.println(asf);
      return;
    }

    visited[sr][sc] = true; // understood this
    FloodFill(arr, visited, sr - 1, sc, asf + "t");
    FloodFill(arr, visited, sr, sc - 1, asf + "l");
    FloodFill(arr, visited, sr + 1, sc, asf + "d");
    FloodFill(arr, visited, sr, sc + 1, asf + "r");
    visited[sr][sc] = false;
    // 4 calls lgne ke baad wipeout hoga tbh visited ko false krna hoga taki wo as a
    // obstacle na rhe aur kisi aur path ka part ban ske
    // 1 hi path print hoga aise
  }

}

// in a matrix can move in all four directions
// matrix or 2d array of 0 and 1
// obstacle is 1
