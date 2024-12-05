package Algorithms;

import java.util.Scanner;

public class GCDOfStrings {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static String findGCD(String s1, String s2) {

        if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        }

        int gcd = gcd(s1.length(), s2.length());

        return s1.substring(0, gcd);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();
        s.close();

        String ans = findGCD(str1, str2);
        System.out.println(ans);
    }
}
