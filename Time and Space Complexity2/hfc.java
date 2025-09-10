import java.util.*;
public class hfc {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine(); // abcdccccdddaa

    int[] arr = new int[26]; // 0-25 0a 25z
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      int idx = ch - 'a';
      arr[idx]++; 
    }

    // for(int i = 0; i < arr.length; i++){
    //   System.out.print(arr[i] + " ");
    // }
    // System.out.println();

    int max = 0;
    for(int i = 1; i < arr.length; i++){
      if(arr[i] > arr[max]){
        max = i;
      }
    }
    // System.out.println(max);

    char ans = (char) (max + 'a');
    System.out.println(ans);
  }
}
// abcdccccdddaa
// c