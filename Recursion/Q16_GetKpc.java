import java.util.*;
public class Q16_GetKpc {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine(); // input in numbers 96

    ArrayList<String> ans = getkpc(str); // 96
    System.out.println(ans);
  }

  public static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" }; // from 0-9

  public static ArrayList<String> getkpc(String str) {
    if (str.length() == 0) {
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }

    char ch = str.charAt(0); // 9
    String ros = str.substring(1); // 6
    ArrayList<String> rres = getkpc(ros);
    ArrayList<String> newal = new ArrayList<>();

    String code = codes[ch - '0']; // 9
    // System.out.println('9' - '0');
    // String code2 = codes[Character.getNumericValue(ch)];

    for (int i = 0; i < code.length(); i++) {
      char chi = code.charAt(i);
      for (String rstr : rres) {
        newal.add(chi + rstr);
      }
    }

    return newal;
  }
}

// '0' - '0' is 0
// '1' - '0' is 1
// '2' - '0' is 2
// '3' - '0' is 3
// '4' - '0' is 4
// '5' - '0' is 5
// '6' - '0' is 6
// '7' - '0' is 7
// '8' - '0' is 8
// '9' - '0' is 9
// System.out.println('9' - '0');
