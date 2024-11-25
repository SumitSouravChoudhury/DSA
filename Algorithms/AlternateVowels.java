package Algorithms;

import java.util.*;

public class AlternateVowels {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        char[] string = str.toCharArray();
        int flag = 0;

        for (int i = 0; i < string.length; i++) {

            if (string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u') {

                if (flag % 2 == 0) {
                    string[i] = Character.toUpperCase(string[i]);
                }
                flag++;
            }
        }

        for (char c : string) {
            System.out.print(c);
        }
    }
}
