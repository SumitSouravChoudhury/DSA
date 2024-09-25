package Algorithms;

import java.util.*;

public class SubarrayWithEqual0and1 {

    public static int findEquals(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                arr[i] = -1;
            }

            sum += arr[i];

            if (sum == 0) {
                count++;
            }

            if (map.containsKey(sum)) {
                count += map.get(sum);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int ans = findEquals(arr, n);

        System.out.println(ans);
    }
}
