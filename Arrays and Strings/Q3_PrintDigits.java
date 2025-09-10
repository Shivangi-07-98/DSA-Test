import java.util.*;
public class Q3_PrintDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int div = 1;
        int temp = n;
        while(temp >= 10){
            temp = temp/10;
            div *= 10;
        }

        while (n != 0) {
            int quo = n/div;
            n = n % div;
            div = div/10;
            System.out.print(quo + " ");
        }

    }
}
