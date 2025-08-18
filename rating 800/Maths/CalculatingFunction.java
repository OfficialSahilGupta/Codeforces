import java.util.*;
import java.io.*;
public class CalculatingFunction{
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

    static char nextChar() throws IOException{
        return next().charAt(0);
    }

    static long solve() throws IOException{
        long n = nextLong();
        if(n % 2 == 0){
            return n/2;
        }
        else return -(n + 1)/2;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}