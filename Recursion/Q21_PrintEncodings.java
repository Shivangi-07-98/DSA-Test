import java.util.*;
public class Q21_PrintEncodings {
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine(); // 123

    ArrayList<String> cont = new ArrayList<>();
    PrintEncodings(str, " ", cont);
    System.out.println(cont);
    // System.out.println('a' + 2 - 1);
  }

  public static void PrintEncodings(String str, String asf, ArrayList<String> cont) {
    if (str.length() == 0) {
      // System.out.println(asf);
      cont.add(asf);
      return;
    } else if (str.length() == 1) {
      String ch0 = str.substring(0, 1); // '2'
      if (ch0.equals("0")) {
        return;
      }
      int numForch0 = Integer.parseInt(ch0); // 2
      String alphabetForch0 = (char) ('a' + numForch0 - 1) + ""; // "" ye add kia taaki char ko string mai convert kre
      // 'a' + 2, c bn jayega but hme b chaiye so 'a' + 2 - 1 = (char)98 = b, then b +
      // '' to make it string from char
      String roq0 = str.substring(1);
      PrintEncodings(roq0, asf + alphabetForch0, cont);
    } else {
      String ch0 = str.substring(0, 1);
      if (ch0.equals("0")) {
        return;
      }
      int numForch0 = Integer.parseInt(ch0);
      String alphabetForch0 = (char) ('a' + numForch0 - 1) + "";
      String roq0 = str.substring(1);
      PrintEncodings(roq0, asf + alphabetForch0, cont);

      // 2 numbers
      String ch01 = str.substring(0, 2);
      int numForch01 = Integer.parseInt(ch01);
      if (numForch01 <= 26) {
        String alphabetForch01 = (char) ('a' + numForch01 - 1) + "";
        String roq1 = str.substring(2);
        PrintEncodings(roq1, asf + alphabetForch01, cont);
      }
    }
  }

}

// 1-26 stands for abcd...yz
// 123 = 1-2-3 abc or 12-3 lc or 1-23 aw
//