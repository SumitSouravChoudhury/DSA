package Algorithms;

import java.util.*;

public class SubArrayWithGivenSum {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int target = s.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0;
        int sum = arr[0];

        for(int i=1; i<=n; i++) {

            while(sum > target && start < i-1) {
                sum -= arr[start];
                start++;
            }

            if(sum == target) {
                ans.add(start);
                ans.add(i-1);
            }

            if(i<n) {
                sum += arr[i];
            }
        }

        for(int x : ans) {
            System.out.println(x);
        }
    }
}
