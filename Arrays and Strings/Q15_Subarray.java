import java.io.*;
import java.util.*;
public class Q15_Subarray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt(); // 4
    int [] a = new int [n];
    for (int i = 0; i < a.length; i++){
        a[i] = scn.nextInt();
    }
    // [ 3 4 5 6]
    
    for(int si = 0; si < a.length; si++){
        for (int ei = si; ei < a.length; ei++){
            for (int elements = si; elements <= ei; elements++){
                System.out.print(a[elements]);
            }
            System.out.println();
        }
    }

  }
}
