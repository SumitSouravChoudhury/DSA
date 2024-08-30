package Algorithms;

import java.util.*;

public class MaximumProduct {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int max_here=arr[0], min_here=arr[0], prod=arr[0];

        for(int i=1; i<n; i++) {

            int temp = Math.max(Math.max(arr[i], arr[i]*max_here), arr[i]*min_here);
            min_here = Math.min(Math.min(arr[i], arr[i]*max_here), arr[i]*min_here);
            max_here = temp;
            prod = Math.max(prod, max_here);
        }

        System.out.println(prod);
    }
}
