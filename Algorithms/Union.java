package Algorithms;

import java.util.*;

public class Union {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n1, int n2) {

        TreeSet<Integer> set = new TreeSet<>();

        for(int i: arr1) {
            set.add(i);
        }

        for(int i : arr2) {
            set.add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i : set) {
            ans.add(i);
        }

        return ans;
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

        ArrayList<Integer> ans = findUnion(arr1, arr2, n1, n2);

        for(int i : ans) {
            System.out.print(i+" ");
        }

    }
}
