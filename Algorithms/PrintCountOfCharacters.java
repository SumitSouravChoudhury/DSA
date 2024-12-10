package Algorithms;

import java.util.Scanner;

public class PrintCountOfCharacters {

    public static void findCount(String str) {

        int[] temp = new int[26];

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                temp[str.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println((char) ('a' + i) + ": " + temp[i]);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        s.close();

        findCount(str);
    }
}
