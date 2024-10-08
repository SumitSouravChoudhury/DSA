package Algorithms;

import java.util.*;

public class StockBuyAndSell {

    public static int stockBuySell(int[] arr, int n) {

        int res = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] > arr[i - 1]) {
                res = res + arr[i] - arr[i - 1];
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int ans = stockBuySell(arr, n);

        System.out.println(ans);
    }
}
