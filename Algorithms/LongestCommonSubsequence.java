package Algorithms;

import java.util.Scanner;

public class LongestCommonSubsequence {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();

        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();

        int m = x.length;
        int n = y.length;

        int[][] lcs = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {

                if(i==0 || j==0) {
                    lcs[i][j] = 0;
                }

                else if(x[i-1]==y[j-1]) {
                    lcs[i][j] = lcs[i-1][j-1]+1;
                }
                else {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }

        System.out.println(lcs[m][n]);
    }
}
