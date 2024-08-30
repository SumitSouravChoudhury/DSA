package Algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Intersection {

    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2, int n1, int n2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];

        for(int i=0; i<n1; i++) {
            arr1[i] = s.nextInt();
        }
        for(int i=0; i<n2; i++) {
            arr2[i] = s.nextInt();
        }

        ArrayList<Integer> ans = findIntersection(arr1, arr2, n1, n2);

        for(int i : ans) {
            System.out.print(i+" ");
        }

    }
}
