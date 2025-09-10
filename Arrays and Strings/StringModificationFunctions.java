import java.util.*;
public class StringModificationFunctions {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello");

    char golu = sb.charAt(0);
    System.out.println(golu); // h

    sb.setCharAt(0, 'b');
    System.out.println(sb); // bello

    sb.deleteCharAt(0);
    System.out.println(sb); // ello

    sb.insert(0, 't');
    System.out.println(sb); // tello

    String s = sb.toString();
    System.out.println(s); // tello

  }
}
