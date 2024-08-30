package Algorithms;

import java.util.*;

public class ReverseWord {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String[] string = str.split(" ");
        String reverseAns = "";

        for(int i=0; i<string.length; i++) {

            String word = string[i];
            String reverseWord = "";

            for(int j=0; j<word.length(); j++) {
                reverseWord = word.charAt(j) + reverseWord;
            }

            reverseAns = " " + reverseWord + reverseAns;
        }

        System.out.println(reverseAns.trim());
    }
}
