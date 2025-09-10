import java.util.*;
public class Q8_DigitFrequency{
    public static void main(String []args){
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt(); // 44456
        int dig = scn.nextInt(); // 4
        int f = GetDigitFrequency(num, dig);
        System.out.println(f);
    }
    
    public static int GetDigitFrequency(int num,int dig){
        
        int freq = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;

            if(dig == rem){
                freq++;
            }
        }
        return freq;
    }
    
}