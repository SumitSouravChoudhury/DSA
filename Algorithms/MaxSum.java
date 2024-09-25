package Algorithms;

import java.util.*;

public class MaxSum {

    public static int findSum(int[] arr, int n) {

        int pivot = findPivot(arr, n);
        int diff = n - 1 - pivot;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum = sum + ((i + diff) % n) * arr[i];
        }

        return sum;
    }

    public static int findPivot(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            if (arr[i] > arr[(i + 1) % n]) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int sum = findSum(arr, n);
        System.out.println(sum);
    }
}
