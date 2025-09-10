import java.io.*;
import java.util.*;

public class Q19_ToggleCase {

  public static String toggleCase(String s) {
    StringBuilder sb = new StringBuilder(s);

    for (int i = 0; i < sb.length(); i++) {
      char ch = sb.charAt(i);

      if (ch >= 'A' && ch <= 'Z') { // capital hai toh small kro lc = uc + ('a'-'A')
        char lc = (char) (ch + ('a' - 'A'));
        sb.setCharAt(i, lc);
      } else { // small hai toh capital kro uc = lc + ('A'-'a')
        char uc = (char) (ch + ('A' - 'a'));
        sb.setCharAt(i, uc);
      }
      
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s = scn.nextLine();
    System.out.println(toggleCase(s));
  }
}

// C-A = c-a
// A = 65...
// a = 97...

// formula 
// C-A = c-a
// C = c + (A-a) or uc = lc + ('A'-'a');
// c = C + (a-A) or lc = uc + ('a'-'A');
