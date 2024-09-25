package Algorithms;

import java.util.*;

public class TripletSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        s.close();

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (target == sum) {
                    System.out.print(arr[i] + " " + arr[l] + " " + arr[r]);
                    break;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
    }
}
