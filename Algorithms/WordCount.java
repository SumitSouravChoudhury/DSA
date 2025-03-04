import java.util.*;

public class WordCount {

  public static int wordCount(String str) {
    if(str.isEmpty() || str==null) {
            return 0;
        }
        
        int count = 0;
        boolean isWord = false;
        
        for(int i=0; i<str.length(); i++) {
            
            char ch = str.charAt(i);
            
            if(ch != ' ') {
                if(!isWord) {
                    count++;
                    isWord = true;
                }
            }
            else {
                isWord = false;
            }
        }
        
        return count;
  }
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    String str = s.nextLine();
    
    int count = wordCount(str);
    System.out.println(count);
    
    s.close();
  }
}
