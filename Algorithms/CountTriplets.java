package Algorithms;

import java.util.*;

public class CountTriplets {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        Arrays.sort(arr);
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            int l = 0;
            int r = i - 1;

            while (l < r) {

                if (arr[i] == arr[l] + arr[r]) {
                    count++;
                    break;
                } else if (arr[i] > arr[l] + arr[r]) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        System.out.println(count);
    }
}
