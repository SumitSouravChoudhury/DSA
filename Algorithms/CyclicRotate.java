package Algorithms;

import java.util.*;

public class CyclicRotate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int first = arr[n - 1];
        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i] = arr[i - 1];
        }

        temp[0] = first;

        for (int x : temp) {
            System.out.print(x + " ");
        }
    }
}
