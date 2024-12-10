package Algorithms;

import java.util.*;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {

            res[i] = res[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            res[i] = res[i] * suffix;
            suffix *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] temp = productExceptSelf(arr);

        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
}
