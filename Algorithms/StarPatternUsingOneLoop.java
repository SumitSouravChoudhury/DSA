package Algorithms;

import java.util.Scanner;

public class StarPatternUsingOneLoop {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int line_no = 1;
        int star = 0;

        for(line_no=1; line_no<=n;) {

            if(star < line_no) {
                System.out.print("* ");
                star++;
                continue;
            }
            else if(line_no == star) {
                System.out.println();
                line_no++;
                star = 0;
            }
        }
    }
}
