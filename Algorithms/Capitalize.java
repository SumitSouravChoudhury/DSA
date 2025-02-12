package Algorithms;

import java.util.Scanner;

public class Capitalize {

    public static String capitalize(String str) {

        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            boolean flag = false;

            if (i == 0 && ch[i] != ' ') {
                ch[i] = Character.toUpperCase(ch[i]);
                flag = true;
            }
            if ((i > 0 && ch[i] != ' ' && ch[i - 1] == ' ')
                    || (i < str.length() - 1 && ch[i] != ' ' && ch[i + 1] == ' ')) {
                ch[i] = Character.toUpperCase(ch[i]);
                flag = true;
            }
            if (i == str.length() - 1 && ch[i] != ' ') {
                ch[i] = Character.toUpperCase(ch[i]);
                flag = true;
            }

            if (!flag) {
                ch[i] = Character.toLowerCase(ch[i]);
            }

        }

        return new String(ch);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String cap = capitalize(str);
        System.out.println(cap);

        s.close();
    }
}
