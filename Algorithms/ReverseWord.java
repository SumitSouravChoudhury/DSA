package Algorithms;

import java.util.*;

public class ReverseWord {

    public static String reverseWord(String str) {

        String[] sArr = str.split(" ");

        int i = 0, j = sArr.length - 1;

        while (i < j) {

            String temp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = temp;
            i++;
            j--;
        }

        return String.join(" ", sArr);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String rev = reverseWord(str);
        System.out.println(rev);

        s.close();
    }
}
