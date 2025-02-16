package Algorithms;

import java.util.*;

public class RearrangeArray {

    public static void rearrange(int[] arr, int n) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        int[] temp = new int[n];
        int i = 0, j = 0, k = 0;
        boolean flag = true;

        while (i < pos.size() && j < neg.size()) {
            if (flag) {
                temp[k++] = neg.get(j++);
                flag = false;
            } else {
                temp[k++] = pos.get(i++);
                flag = true;
            }
        }

        while (j < neg.size()) {
            temp[k++] = neg.get(j++);
        }

        while (i < pos.size()) {
            temp[k++] = pos.get(i++);
        }

        for (int m = 0; m < n; m++) {
            arr[m] = temp[m];
        }
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        rearrange(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
