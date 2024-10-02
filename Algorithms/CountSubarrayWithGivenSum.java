package Algorithms;

import java.util.*;

public class CountSubarrayWithGivenSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target_sum = s.nextInt();
        s.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int cur_sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            cur_sum += arr[i];

            if (map.containsKey(cur_sum - target_sum)) {
                count += map.get(cur_sum - target_sum);
            }

            map.put(cur_sum, map.getOrDefault(cur_sum, 0) + 1);
        }

        System.out.println(count);
    }
}
