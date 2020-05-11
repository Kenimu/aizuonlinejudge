import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        String result = "Yes";

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        if(a >= b){
            result = "No";
        }
        if(b >= c){
            result = "No";
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