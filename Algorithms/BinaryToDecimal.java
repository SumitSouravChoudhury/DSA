package Algorithms;

import java.util.*;

public class BinaryToDecimal {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int bin = s.nextInt();
        int ans = 0;
        int base = 1;

        while(bin > 0) {

            int temp = bin%2;
            ans += temp*base;
            base = base*2;
            bin = bin/10;
        }

        System.out.println(ans);
    }
}
