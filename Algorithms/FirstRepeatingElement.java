package Algorithms;

import java.util.*;

public class FirstRepeatingElement {

    public static int find(int[] arr, int n) {

        int ans = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {

            if (set.contains(arr[i])) {
                ans = arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int ans = find(arr, n);

        System.out.println(ans);
    }
}
