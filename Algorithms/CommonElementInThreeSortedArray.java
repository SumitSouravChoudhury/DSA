package Algorithms;

import java.util.*;

public class CommonElementInThreeSortedArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = s.nextInt();
        }

        int n3 = s.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = s.nextInt();
        }
        s.close();

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                ans.add(arr1[i]);
                i++;
                j++;
                k++;
                while (i < arr1.length && arr1[i] == arr1[i - 1])
                    i++;

                while (j < arr2.length && arr2[j] == arr2[j - 1])
                    j++;

                while (k < arr3.length && arr3[k] == arr3[k - 1])
                    k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        System.out.println(ans);
    }
}
