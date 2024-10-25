package Algorithms;

import java.util.*;

public class GCD {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        s.close();

        int ans = gcd(a, b);

        System.out.println(ans);
    }
}
