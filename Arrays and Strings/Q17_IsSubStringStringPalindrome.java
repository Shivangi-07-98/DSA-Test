import java.util.*;

public class Q17_IsSubStringStringPalindrome {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine(); // abcc

    for (int i = 0; i < str.length(); i++) {
      for (int j = i; j < str.length(); j++) {
        String val = str.substring(i, j + 1);
        // System.out.println(val);

        boolean ans = isPalindrome(val);
        if (ans == true) {
          System.out.println(val);
        }
      }
    }

  }

  public static boolean isPalindrome(String val) {
    int left = 0;
    int right = val.length() - 1;
    while (left < right) {
      if (val.charAt(left) != val.charAt(right)) {
        return false;
      } else {
        left++;
        right--;
      }
    }
    return true;
  }

}
