import java.util.*;
import java.io.*;

public class EvenOdds{
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
        long n = nextLong(), k = nextLong();

        long oddCount = (n + 1) / 2;
        long ans;


        if(k <= oddCount){
            return ans = (2 * k) - 1;
        }

        else{
            return ans = 2 * (k - oddCount);
        }
        
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}