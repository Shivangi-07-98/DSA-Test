import java.util.*;

public class IntroStrings2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    System.out.println(str);
    System.out.println(str.length());

    for (int i = 0; i < str.length(); i++) {
      // char ch = str[i]; // wrong
      char ch = str.charAt(i);
      System.out.println(ch);
    }

    str += " very";
    System.out.println(str);

    //------------------------------------

    String s = "hello";
    char ch = s.charAt(0);
    System.out.println(ch);

    s.replace('h', 'b');
    System.out.println(s);

    s = s.replace('h', 'b');
    System.out.println(s);

  }

}
