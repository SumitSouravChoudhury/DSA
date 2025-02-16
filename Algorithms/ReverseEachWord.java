package Algorithms;

import java.util.Scanner;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {

        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else {
                ans.append(word.reverse()).append(" ");
                word.setLength(0);
            }

        }

        ans.append(word.reverse());

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String rev = reverseEachWord(str);
        System.out.println(rev);

        s.close();
    }
}
