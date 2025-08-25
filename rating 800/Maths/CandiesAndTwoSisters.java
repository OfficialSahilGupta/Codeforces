import java.util.*;
import java.io.*;

public class CandiesAndTwoSisters{
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
        int n = nextInt();
        int ways = 0;
        if(n <= 2){
            return 0;
        }
        
        else{
            if(n % 2 == 0){
                ways = (n / 2) - 1;
            }
            else ways = (n / 2);
        }

        return ways;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}