import java.util.*;
public class Q20_PrintPermutations {
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine(); // abc

    ArrayList<String> cont = new ArrayList<>();
    PrintPermutations(str, "", cont); // xyz xzy yxz yzx zxy zyx
    System.out.println(cont);
  }

  public static void PrintPermutations(String str, String bres, ArrayList<String> cont) {
    if (str.length() == 0) {
      // System.out.print(bres + ",");
      cont.add(bres);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      String left = str.substring(0, i);
      String right = str.substring(i + 1);
      PrintPermutations(left + right, bres + ch, cont);
    }
  }

}
