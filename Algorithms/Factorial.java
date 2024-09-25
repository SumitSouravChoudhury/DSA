package Algorithms;

import java.math.BigInteger;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.close();

        BigInteger fact = new BigInteger("1");

        for (int i = 2; i <= n; i++) {

            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);

    }
}
