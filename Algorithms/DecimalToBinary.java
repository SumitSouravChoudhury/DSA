package Algorithms;

import java.util.*;

public class DecimalToBinary {

    public static String decToBin(int dec) {

        StringBuilder sb = new StringBuilder();

        while (dec > 0) {
            int rem = dec % 2;
            sb.insert(0, rem);
            dec /= 2;
        }

        return new String(sb);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int dec = s.nextInt();

        String bin = decToBin(dec);
        System.out.println(bin);
        s.close();
    }
}
