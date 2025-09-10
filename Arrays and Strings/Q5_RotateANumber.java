import java.util.*;

public class Q5_RotateANumber {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();

      int nod = 0;
      int temp = n;
      while (temp != 0) {
         temp = temp / 10;
         nod++;
      }
      // System.out.println(nod);

      k = k % nod;
      if (k < 0) {
         k = k + nod;
      }
      // System.out.println(k);

      int div = (int) Math.pow(10, k);
      int rem = n % div;
      int quo = n / div;

      int num = (rem * (int) Math.pow(10, nod - k)) + quo;
      System.out.println(num);

   }
}

// int div = 1;
// int mult = 1;
// for (int i=1; i<=nod; i++){
// if(i<=k){
// div = div * 10;
// }
// else{
// mult = mult *10;
// }
// }
