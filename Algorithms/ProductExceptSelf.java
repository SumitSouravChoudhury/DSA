package Algorithms;

import java.util.*;

public class ProductExceptSelf {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        
        int product = 1;

        for(int i=0; i<n; i++) {
            product *= arr[i];
        }

        for(int i=0; i<n; i++) {
            System.out.print(product/arr[i] + " ");
        }
    }
}
