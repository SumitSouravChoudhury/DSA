package Algorithms;

import java.util.*;

public class MissingAndRepeating {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int missing = (n * (n + 1)) / 2;
        int repeating = -1;

        for (int i = 0; i < n; i++) {

            int abs = Math.abs(arr[i]);

            if (arr[abs - 1] > 0) {
                arr[abs - 1] = -arr[abs - 1];
                missing -= abs;
            } else {
                repeating = abs;
            }
        }

        System.out.println(missing + " " + repeating);
    }
}
