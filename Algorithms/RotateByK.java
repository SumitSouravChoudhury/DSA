package Algorithms;

import java.util.*;

public class RotateByK {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        s.close();

        int[] temp = new int[n];
        int j = 0;
        k = k % n;

        for (int i = 0; i < n; i++) {

            if (i < k) {
                temp[j++] = arr[n - k + i];
            } else {
                temp[j++] = arr[i - k];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
