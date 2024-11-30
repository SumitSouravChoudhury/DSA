package Algorithms;

import java.util.*;

public class MergeTwoWordsAlternatively {

    public static String merge(String str1, String str2) {

        String str = "";

        int i = 0, j = 0;
        boolean flag = true;
        while (i < str1.length() && j < str2.length()) {

            if (flag) {
                str += str1.charAt(i++);
                flag = false;
            } else {
                str += str2.charAt(j++);
                flag = true;
            }
        }

        while (i < str1.length()) {
            str += str1.charAt(i++);
        }
        while (j < str2.length()) {
            str += str2.charAt(j++);
        }

        return str;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();

        String str = merge(str1, str2);
        System.out.println(str);
        s.close();
    }
}