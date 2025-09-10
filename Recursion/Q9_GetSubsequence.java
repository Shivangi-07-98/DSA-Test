import java.util.*;

public class Q9_GetSubsequence {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.nextLine(); // abc

    ArrayList<String> ans = gss(input); // [___, __c, _b_, _bc, a__, a_c, ab_, abc]
    System.out.println(ans); // bheja normal string tha aaya array mai bhar ke
  }

  public static ArrayList<String> gss(String input) {
    if (input.length() == 0) { // yha bna string ka array
      ArrayList<String> newarr = new ArrayList<>();
      newarr.add("");
      return newarr;
    }

    char ch = input.charAt(0); // a
    String ros = input.substring(1); // bc
    ArrayList<String> rres = gss(ros);
    ArrayList<String> ans = new ArrayList<>();

    for (String abc : rres) { // abc catches each String element
      ans.add("_" + abc);
    }

    for (String abc : rres) {
      ans.add(ch + abc);
    }

    return ans;
  }

}
// 2^n = 2^3 = 8
// c = _ , c
// bc = _ _ , _ c , b _ , b c (c mai 2 loop chlega ek nhi aane ka, ek aane ka)
// abc = _ _ _ , _ _ c , _ b _ , _ b c
//       a _ _ , a _ c , a b _ , a b c (bc mai 2 loop chlega ek nhi aane ka, ek aane ka)

