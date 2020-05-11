import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        String result = "a > b";

        if(a < b){
            result = "a < b";
        }else if(a == b){
            result = "a == b";
        }

        System.out.println(result);
    }
}
class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {   
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
     
    public long nextInt() {
        return Integer.parseInt(next());
    }

}