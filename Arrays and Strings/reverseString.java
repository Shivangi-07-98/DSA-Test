import java.io.*;
import java.util.*;
public class reverseString {
  public static void main(String[] args) {
    // String str = "shivangi"; // ignavihs
    String str = "my name is shivangi";

    // String ans = "";
    // for(int i = 0; i < str.length(); i++){
    //   // char ch = str.charAt(i);
    //   // ans = ch + ans;
    //   ans = str.charAt(i) + ans;
    // }

    String[] val = str.split(" ");
    for(int i = 0; i < val.length; i++){
      System.out.print(val[i] + " ");

      String name = val[i];
      for(int j = 0; j < name.length(); j++){
        
      }
    }

    // String res = "";
    // for(String value: val){
    //   if(value.length() > 0){
    //     res += value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase() + " ";
    //   }
    // }
    // System.out.println(res);
  }
}
