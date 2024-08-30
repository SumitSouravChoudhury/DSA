package Algorithms;

import java.util.*;

public class MaximumSubarray {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int sum = Integer.MIN_VALUE;
        int max_ending_here = 0;


        for(int i=0; i<n; i++) {
            max_ending_here += arr[i];

            if(sum < max_ending_here) {
                sum = max_ending_here;
            }

            if(max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        System.out.println(sum);
    }
}
