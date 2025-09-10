import java.util.*;
public class IntroStrings1 {
  public static void main(String[] args) {

    String golu = "hello";
    System.out.println(golu);
    System.out.println(golu.length());

    for (int i = 0; i < golu.length(); i++) {
      // char ch = golu[i]; // wrong
      char ch = golu.charAt(i);
      System.out.println(ch);
    }

    golu += " world";
    System.out.println(golu);
    System.out.println(10 + 20 + "hello" + 10 + 20);

    System.out.println(golu.substring(0));
    System.out.println(golu.substring(0, 3));
    System.out.println(golu.substring(0, 5));
    System.out.println(golu.substring(0, 6));
    System.out.println(golu.substring(0, 7));
    System.out.println(golu.substring(3));

  }
}
