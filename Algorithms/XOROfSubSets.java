package Algorithms;

import java.util.*;

public class XOROfSubSets {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int ans = 0;

        for(int i=0; i<n; i++) {
            ans |= arr[i];
        }

        System.out.print(ans*(1<<(n-1)));
    }
}
