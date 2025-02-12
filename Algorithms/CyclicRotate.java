package Algorithms;

import java.util.Scanner;

public class CyclicRotate {

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void cyclicRotate(int[] arr, int d) {

        int n = arr.length;
        d = d % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();

        cyclicRotate(arr, d);

        s.close();
    }
}
