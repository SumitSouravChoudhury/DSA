package Algorithms;

import java.util.*;

public class MinJump {

    public static int minimumJump(int[] arr, int n) {

        if (n == 0 || arr[0] == 0) {
            return Integer.MAX_VALUE;
        }

        int[] jumps = new int[n];
        jumps[0] = 0;

        for (int i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;

            for (int j = 0; j < i; j++) {

                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }

        return jumps[n - 1];
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int min = minimumJump(arr, n);
        System.out.println(min);
    }
}
