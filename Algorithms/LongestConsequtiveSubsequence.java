package Algorithms;

import java.util.*;

public class LongestConsequtiveSubsequence {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for (int i : arr) {
            set.add(i);
        }

        for (int i = 0; i < n; i++) {

            if (!set.contains(arr[i] - 1)) {

                int j = arr[i];

                while (set.contains(j)) {
                    j++;

                }
                if (ans < j - arr[i]) {
                    ans = j - arr[i];
                }
            }
        }

        System.out.println(ans);
    }
}
