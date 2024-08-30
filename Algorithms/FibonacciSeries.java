package Algorithms;

import java.util.*;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a=0,b=1;

        for(int i=0; i<n; i++) {

            System.out.print(a + " ");

            int c = a+b;
            a = b;
            b = c;
        }
    }
}
