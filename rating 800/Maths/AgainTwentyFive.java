import java.util.*;
import java.io.*;

public class AgainTwentyFive{
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
    static Long nextLong() throws IOException{
        return Long.parseLong(next());
    }

    static long solve() throws IOException{
        long n = nextLong();
        return 25;

    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}