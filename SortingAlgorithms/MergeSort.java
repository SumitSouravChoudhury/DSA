package SortingAlgorithms;

import java.util.Scanner;

public class MergeSort {

    public void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid-low+1;
        int n2 = high-mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++) {
            left[i] = arr[low+i];
        }
        for(int i=0; i<n2; i++) {
            right[i] = arr[i+mid+1];
        }

        int i=0,j=0,k=low;

        while(i<n1 && j<n2) {

            if(left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void mergesort(int[] arr, int low, int high) {

        if(low < high) {

            int mid = low + (high-low)/2;

            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);

            merge(arr, low, mid, high);
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

        MergeSort obj = new MergeSort();
        obj.mergesort(arr, 0, n-1);
        obj.print(arr, n);
    }
}
