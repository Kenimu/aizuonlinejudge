import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int[] spade = new int[14];
        int[] heart = new int[14];
        int[] club = new int[14];
        int[] diamond = new int[14];

        int n = sc.nextInt();
        String mark = null;
        int rank = 0;
        for(int i=0;i<n;i++){
            mark = sc.next();
            rank = sc.nextInt();
            switch(mark){
                case "S":
                    spade[rank] = rank;
                    break;
                case "H":
                    heart[rank] = rank;
                    break;
                case "C":
                    club[rank] = rank;
                    break;
                case "D": 
                    diamond[rank] = rank;
                    break;
            }
        }

        for(int i=0;i<4;i++){
            if(i==0){
                for(int j=1;j<14;j++){
                    if(spade[j] != j){
                        out.println("S " + j);
                    }
                }
            }else if(i==1){
                for(int j=1;j<14;j++){
                    if(heart[j] != j){
                        out.println("H " + j);
                    }
                }
            }else if(i==2){
                for(int j=1;j<14;j++){
                    if(club[j] != j){
                        out.println("C " + j);
                    }
                }
            }else{
                for(int j=1;j<14;j++){
                    if(diamond[j] != j){
                        out.println("D " + j);
                    }
                }
            }
        }
        out.flush();
    }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}