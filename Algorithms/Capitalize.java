package Algorithms;

import java.util.Scanner;

public class Capitalize {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        char[] ch = str.toCharArray();

        ch[0] = Character.toUpperCase(ch[0]);

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == ' ') {
                ch[i - 1] = Character.toUpperCase(ch[i - 1]);
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
            }
        }

        ch[ch.length - 1] = Character.toUpperCase(ch[ch.length - 1]);

        String result = new String(ch);

        System.out.println(result);
    }
}
