import java.util.*;
import java.io.*;

public class CreatingWords{
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
        String a = next();
        String b = next();

        StringBuilder sb = new StringBuilder();
        sb.append(b.charAt(0));
        sb.append(a.charAt(1));
        sb.append(a.charAt(2));
        sb.append(" ");
        sb.append(a.charAt(0));
        sb.append(b.charAt(1));
        sb.append(b.charAt(2));

        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

    
}