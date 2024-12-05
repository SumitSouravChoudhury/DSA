package Algorithms;

import java.util.Scanner;

public class IncreasingTripletSubsequence {

    public static boolean findSequence(int[] arr, int n) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (min1 >= arr[i]) {
                min1 = arr[i];
            } else if (min2 >= arr[i]) {
                min2 = arr[i];
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        boolean ans = findSequence(arr, n);
        System.out.println(ans);
    }
}
