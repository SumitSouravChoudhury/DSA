package Algorithms;

import java.util.*;

public class PairWithGivenSum {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
    
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int sum = s.nextInt();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<n; i++) {

            if(map.containsKey(sum-arr[i])) {
                count += map.get(sum-arr[i]);
            }

            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(count);
    }
    
}