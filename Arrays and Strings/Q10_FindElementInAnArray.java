import java.io.*;
import java.util.*;
public class Q10_FindElementInAnArray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] golu = new int [n];
    for (int i = 0; i < golu.length; i++){
        golu [i] = scn.nextInt();
    }

    // [5 8 3 9 2]
    int d = scn.nextInt(); // 9
    
    int index = -1; 
    for (int i = 0; i < golu.length; i++){
        if (d == golu[i]){
            index = i;
            break;
        }
    }
    System.out.print(index);
 }

}