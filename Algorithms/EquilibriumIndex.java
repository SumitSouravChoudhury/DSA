package Algorithms;

import java.util.*;

public class EquilibriumIndex {

    public static int findIndex(int[] arr, int n) {

        int right_sum = 0, left_sum = 0;

        for (int i = 0; i < n; i++) {
            right_sum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            right_sum = right_sum - arr[i];

            if (left_sum == right_sum) {
                return i;
            }

            left_sum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int result = findIndex(arr, n);

        System.out.println(result);
    }
}
