import java.io.*;
import java.util.*;

public class TheatreSquare{
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

    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }

    static long solve() throws IOException{
        long n = nextLong(), m = nextLong(), a = nextLong();

        return ((n + a - 1) / a) * ((m + a - 1)/ a);

    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}