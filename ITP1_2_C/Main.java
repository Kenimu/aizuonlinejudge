import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        List<String> inputList = Arrays.asList(sc.nextLine().split(" "));

        Collections.sort(inputList);

        for(int i=0;i<3;i++){
            System.out.print(inputList.get(i));
            if(i == 2){
                break;
            }
            System.out.print(" ");
        }
        System.out.println();

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