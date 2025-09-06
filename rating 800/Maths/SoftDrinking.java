import java.util.*;
import java.io.*;

public class SoftDrinking{
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

    static int solve() throws IOException{
        int n = nextInt(), k = nextInt(), l = nextInt();
        int c = nextInt(), d = nextInt(), p = nextInt();
        int nl = nextInt(), np = nextInt();

        return Math.min((k * l)/nl , Math.min(c * d, p / np)) / n;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}