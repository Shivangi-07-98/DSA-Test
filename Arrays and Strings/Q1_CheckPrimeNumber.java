import java.util.*;
public class Q1_CheckPrimeNumber{
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 7

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number");
                return;
            }
        }

        System.out.println(n + " is a prime number");

    }
}