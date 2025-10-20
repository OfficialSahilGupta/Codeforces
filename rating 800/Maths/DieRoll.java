import java.util.*;
import java.io.*;

public class DieRoll{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine());
        }

        return st.nextToken();
    }

    static int nextInt() throws IOException{
        return Integer.parseInt(next());
    }

    static String solve() throws IOException{
        int y = nextInt();
        int w = nextInt();
        int m = Math.max(y, w);
        
        int numberator = 7 - m;
        int denominator = 6;

        int gcd = gcd(numberator, denominator);
        numberator /= gcd;
        denominator /= gcd;

        StringBuilder sb = new StringBuilder();
        sb.append(numberator);
        sb.append("/");
        sb.append(denominator);
        
        return sb.toString();
    }

    static int gcd(int y, int w){
        if(w == 0) return y;
        return gcd(w, y % w);
    }

    public static void main(String[] args) throws IOException{
        // int t = nextInt();
        // while(t-- > 0){
            System.out.println(solve());
        // }
    }

    
}