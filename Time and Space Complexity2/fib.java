import java.util.*;
public class fib {

  public static void main(String[] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt(); //9
    
    for(int i = 0; i < n; i++){
      int ans = fib(i);
      System.out.print(ans + " ");
    }
  }

  public static int fib(int n){
    if(n == 0 || n == 1){
      return n;
    }

    int val1 = fib(n-1); // 1
    int val2 = fib(n-2); // 0

    return (val1 + val2);
  }
  
}
// 0 1 1 2 3 5 8 13 21 34 55 