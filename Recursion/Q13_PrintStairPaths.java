import java.util.*;

public class Q13_PrintStairPaths {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 3
    ArrayList<String> cont = new ArrayList<>();
    psp(n, "", cont);
    System.out.println(cont);
  }

  public static void psp(int n, String bres, ArrayList<String> cont) {
    if (n == 0) {
      // System.out.print(bres + ",");
      cont.add(bres);
      return; // Add this return statement
    } else if (n < 0) {
      return;
    }

    psp(n - 1, bres + "1", cont);
    psp(n - 2, bres + "2", cont);
    psp(n - 3, bres + "3", cont);
  }

}
