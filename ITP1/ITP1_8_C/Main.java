import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        int[] count = new int[26];
        char[] ch = null;
        System.out.println(count.length);
        while(sc.hasNextLine()){
            str = sc.nextLine();
            ch = str.toLowerCase().toCharArray();
            
            for(int i=0;i<ch.length;i++){
                if(ch[i] >= 'a' && ch[i] <= 'z'){
                    count[ch[i] - 'a']++;
                }
            }
        }
        for(int i=0;i<count.length;i++){
            System.out.println((char)(i + 'a') + " : " + count[i]);
        }
    }
}
