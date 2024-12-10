package Algorithms;

import java.util.*;

public class MinJump {

    public static int minimumJump(int[] arr, int n) {

        int far = 0, near = 0, jumps = 0;

        while (far < arr.length - 1) {

            int farthest = 0;

            for (int i = near; i <= far; i++) {

                farthest = Math.max(farthest, i + arr[i]);
            }

            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;
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
