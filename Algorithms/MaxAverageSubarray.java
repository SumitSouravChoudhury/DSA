package Algorithms;

import java.util.Scanner;

public class MaxAverageSubarray {

    public static double findAvg(int[] arr, int n, int k) {

        double sum = 0.0d;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double max = sum / k;
        int preSum = arr[0], j = 1;

        for (int i = k; i < n; i++) {

            sum = ((sum + arr[i]) - preSum);

            double avg = sum / k;
            if (avg > max) {
                max = avg;
            }

            preSum = arr[j++];
        }
        return max;
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

        double ans = findAvg(arr, n, k);
        System.out.println(ans);
    }
}
