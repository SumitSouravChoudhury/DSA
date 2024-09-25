package Algorithms;

import java.util.*;

public class SubarrayWithZeroSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                System.out.println(true);
                flag = true;
                break;
            }

            set.add(sum);
        }

        if (!flag) {
            System.out.println(false);
        }
    }
}
