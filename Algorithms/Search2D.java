package Algorithms;

import java.util.*;

public class Search2D {

    public static boolean search(int[][] arr, int low, int high, int x) {

        int n = arr[0].length;

        while (low <= high) {

            int mid = (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            if (arr[row][col] == x) {
                return true;
            } else if (arr[row][col] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int x = s.nextInt();
        s.close();

        int low = 0, high = m * n - 1;
        boolean ans = search(arr, low, high, x);

        System.out.println(ans ? "true" : "false");
    }
}
