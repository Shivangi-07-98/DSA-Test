import java.util.*;
public class Q7_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(); // 4
        int b = scn.nextInt(); // 3
        int c = scn.nextInt(); // 5

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        if(max == a){
            boolean ans = ((b*b) + (c*c) == (a*a));
            System.out.println(ans);
        }
        else if(max == b){
            boolean ans = ((a*a) + (c*c) == (b*b));
            System.out.println(ans);
        }
        else{
            boolean ans = ((a*a) + (b*b) == (c*c));
            System.out.println(ans);
        }
        
    }
}
