package Algorithms;

import java.util.*;

public class KthLargest {

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high; j++) {

            if (arr[j] > pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;

        return (i + 1);
    }

    public static int quickselect(int[] arr, int low, int high, int k) {

        if (low <= high) {

            int pi = partition(arr, low, high);

            if (pi == k - 1) {
                return arr[pi];
            } else if (pi < k - 1) {
                return quickselect(arr, pi + 1, high, k);
            } else {
                return quickselect(arr, low, pi - 1, k);
            }
        }

        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int k = s.nextInt();
        s.close();

        int ans = quickselect(arr, 0, n - 1, k);
        System.out.println(ans);
    }
}
