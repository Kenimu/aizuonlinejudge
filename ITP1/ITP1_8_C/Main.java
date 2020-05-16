import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] count = new int[26];
        while(sc.hasNextLine()){
            String str = sc.nextLine().toLowerCase();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if('a' <= ch && ch <= 'z'){
                    count[ch - 'a']++;
                }
            }
        }

        for(int i=0;i<count.length;i++){
            out.println((char)(i + 'a') + " : " + count[i]);
        }

        out.flush();
    }
}