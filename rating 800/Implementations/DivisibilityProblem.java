import java.util.*;
import java.io.*;
public class DivisibilityProblem{
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
        int moves = 0;
        long a = nextLong();
        long b = nextLong();
        if(a % b == 0) return moves;
        return b - (a % b);
    
    }

    public static void main(String[] args) throws IOException{
        int n = nextInt();
        while(n-- > 0){
            System.out.println(solve());
        }
    }
}