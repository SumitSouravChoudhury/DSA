package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    public void bubblesort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for(int i=0; i<n-1; i++) {

            swapped = false;

            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(swapped == false) {
                break;
            }
        }
    }

    public void printArray(int[] arr, int n) {

        for(int i=0; i<n; i++) {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        BubbleSort obj = new BubbleSort();
        obj.bubblesort(arr);
        obj.printArray(arr, n);
    }
}
