package SortingAlgorithms;

import java.util.*;

public class QuickSort {

    public int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++) {

            if(arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }

    public void quicksort(int[] arr, int low, int high) {

        if(low < high) {

            int pi = partition(arr, low, high);

            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }

    public void print(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
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

        QuickSort obj = new QuickSort();
        obj.quicksort(arr, 0, n-1);
        obj.print(arr, n);
    }
}
