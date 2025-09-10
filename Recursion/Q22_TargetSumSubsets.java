// O(2^n)
import java.util.*;
public class Q22_TargetSumSubsets {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // 5
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt(); // 10 20 30 40 50
    }
    int tar = scn.nextInt(); // 60
    TargetSumSubsets(arr, 0, "", 0, tar);
  }

  public static void TargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
    if (idx == arr.length) {
      if (sos == tar) {
        System.out.println(set);
      }
      return;
    }

    TargetSumSubsets(arr, idx + 1, set, sos, tar);
    TargetSumSubsets(arr, idx + 1, set + arr[idx] + " ", sos + arr[idx], tar);
  }

}

// All 32 subsets of [10, 20, 30, 40, 50]
// 1. [_, _, _, _, _] = sum 0
// 2. [_, _, _, _, 50] = sum 50
// 3. [_, _, _, 40, _] = sum 40
// 4. [_, _, _, 40, 50] = sum 90
// 5. [_, _, 30, _, _] = sum 30
// 6. [_, _, 30, _, 50] = sum 80
// 7. [_, _, 30, 40, _] = sum 70
// 8. [_, _, 30, 40, 50] = sum 120
// 9. [_, 20, _, _, _] = sum 20
// 10. [_, 20, _, _, 50] = sum 70
// 11. [_, 20, _, 40, _] = sum 60**
// 12. [_, 20, _, 40, 50] = sum 110
// 13. [_, 20, 30, _, _] = sum 50
// 14. [_, 20, 30, _, 50] = sum 100
// 15. [_, 20, 30, 40, _] = sum 90
// 16. [_, 20, 30, 40, 50] = sum 140
// 17. [10, _, _, _, _] = sum 10
// 18. [10, _, _, _, 50] = sum 60**
// 19. [10, _, _, 40, _] = sum 50
// 20. [10, _, _, 40, 50] = sum 100
// 21. [10, _, 30, _, _] = sum 40
// 22. [10, _, 30, _, 50] = sum 90
// 23. [10, _, 30, 40, _] = sum 80
// 24. [10, _, 30, 40, 50] = sum 130
// 25. [10, 20, _, _, _] = sum 30
// 26. [10, 20, _, _, 50] = sum 80
// 27. [10, 20, _, 40, _] = sum 70
// 28. [10, 20, _, 40, 50] = sum 120
// 29. [10, 20, 30, _, _] = sum 60**
// 30. [10, 20, 30, _, 50] = sum 110
// 31. [10, 20, 30, 40, _] = sum 100
// 32. [10, 20, 30, 40, 50] = sum 150
