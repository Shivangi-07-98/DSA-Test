import java.util.*;
public class Q4_InverseOfANumber{

public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    
    int place1 = 0;
    int num = 0;
    while (n != 0) {
        int rem = n % 10;
        n = n/10;
        place1++;
        int value1 = rem;

        int place2 = rem;
        int value2 = place1;

        num += value2 * (int) (Math.pow(10, place2 - 1));
    }
    System.out.println(num);
 }
}