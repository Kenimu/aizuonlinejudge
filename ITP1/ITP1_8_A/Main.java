import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        String input = sc.nextLine();

        int length = input.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            Character ch = input.charAt(i);
            // if(!Character.isLetter(ch)){
            //     sb.append(ch);
            //     continue;
            // }
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(Character.toUpperCase(ch));
            }
        }
        out.println(sb.toString());
        out.flush();
    }
}