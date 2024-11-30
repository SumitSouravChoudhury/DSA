package Algorithms;

import java.util.*;

public class PrintUniqueIntegers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        int[] freq = new int[max + 1];

        for (int i : arr) {
            freq[i]++;
        }

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
