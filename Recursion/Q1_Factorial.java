import java.io.*;
import java.util.*;
public class Q1_Factorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 5
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n) { // 5 4 3 2 1 = 120
        if(n == 0){
            return 1; // 0! = 1
        }
        int a = factorial(n-1);
        int val = n * a;
        return val; 
    }
    
}