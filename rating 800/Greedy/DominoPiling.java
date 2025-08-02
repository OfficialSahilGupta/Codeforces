import java.util.*;
import java.io.*;

public class DominoPiling{
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
        int m = nextInt();
        int n = nextInt();

        return (m * n) / 2;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}