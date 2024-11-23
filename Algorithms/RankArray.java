package Algorithms;

import java.util.*;

public class RankArray {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;

        for (int i = 0; i < n; i++) {
            if (map.get(temp[i]) == null) {
                map.put(temp[i], count);
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(map.get(arr[i]) + " ");
        }

    }
}
