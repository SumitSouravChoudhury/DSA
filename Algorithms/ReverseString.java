package Algorithms;

import java.util.*;

public class ReverseString {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        int end = str.length();
        String ans = "";

        for(int i=end-1; i>=0; i--) {
            
            if(str.charAt(i) == '.') {

                ans += str.substring(i+1, end) + ".";
                end = i;
            }
        }

        ans += str.substring(0, end);
        System.out.println(ans);
    }
}
