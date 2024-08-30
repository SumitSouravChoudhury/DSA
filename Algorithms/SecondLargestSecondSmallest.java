package Algorithms;

import java.util.*;

public class SecondLargestSecondSmallest {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int largest = arr[0], secondlargest = Integer.MIN_VALUE, smallest = arr[0], secondsmallest = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++) {

            if(arr[i] > largest) {
                largest = arr[i];
            }

            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        for(int i=0; i<n; i++) {

            if(arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }

            if(arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        ans.add(secondsmallest);
        ans.add(secondlargest);

        for(int x : ans) {
            System.out.println(x);
        }
    }
}
