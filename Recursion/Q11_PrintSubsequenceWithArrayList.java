import java.util.*;

public class Q11_PrintSubsequenceWithArrayList {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    ArrayList<String> container = new ArrayList<>();
    pss(str, "", container);
    System.out.println(container);
  }

  public static void pss(String str, String asf, ArrayList<String> container) {
    if (str.length() == 0) {
      container.add(asf);
      return;
    }
    char ch = str.charAt(0);
    String ros = str.substring(1);

    pss(ros, asf + ch, container);
    pss(ros, asf + "_ ", container);
  }
}
