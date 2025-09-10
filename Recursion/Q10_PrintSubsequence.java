import java.util.*;

public class Q10_PrintSubsequence {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine(); // bc
    pss(str, "");
  }

  public static void pss(String str, String asf) {
    if (str.length() == 0) {
      System.out.print(asf + ",");
      return;
    }
    char ch = str.charAt(0); // 1
    String ros = str.substring(1); // 2

    pss(ros, asf + ch); // 3
    pss(ros, asf + "_"); // 4
  }
}
