package Algorithms;

import java.util.*;

public class InversionCount {

    public static int merge(int[] arr, int low, int mid, int high) {

        int result = 0;
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                result += (n1 - i);
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }

        return result;
    }

    public static int countInv(int[] arr, int low, int high) {

        int res = 0;

        if (low < high) {

            int mid = (high + low) / 2;

            res += countInv(arr, low, mid);
            res += countInv(arr, mid + 1, high);

            res += merge(arr, low, mid, high);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int ans = countInv(arr, 0, n - 1);
        System.out.println(ans);
    }
}
