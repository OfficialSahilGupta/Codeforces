import java.util.*;
import java.io.*;

public class Homework{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String solve() throws IOException {
        int n = nextInt();
        String a = next();
        int m = nextInt();
        String b = next();
        String c = next();

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        for(int i = 0; i < m; i++){
            if(c.charAt(i) == 'D'){
                sb.append(b.charAt(i));
            }
            else{
                sb.insert(0, b.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            System.out.println(solve());
        }
    }
} 