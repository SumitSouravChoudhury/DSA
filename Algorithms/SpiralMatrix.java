package Algorithms;

import java.util.*;

public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        s.close();

        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0, left = 0, bottom = m - 1, right = n - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        System.out.println(ans);
    }
}
