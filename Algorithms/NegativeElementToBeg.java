package Algorithms;

import java.util.*;

public class NegativeElementToBeg {

    public static void moveToBeg(int[] arr, int n) {

        int[] temp = new int[n];
        int j = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] < 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<n; i++) {
            if(arr[i] >= 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<n; i++) {
            arr[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        moveToBeg(arr, n);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
