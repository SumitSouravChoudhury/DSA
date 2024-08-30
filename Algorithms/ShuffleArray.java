package Algorithms;

import java.util.*;

public class ShuffleArray {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int m = n/2;

        int[] temp = new int[n];
        int j=0,k=0;

        for(int i=0; i<n; i++) {

            if(i%2==0) {
                temp[i] = arr[j++];
            }
            else {
                temp[i] = arr[m+k];
                k++;
            }
        }

        for(int x: temp) {
            System.out.print(x+" ");
        }
    }
}
