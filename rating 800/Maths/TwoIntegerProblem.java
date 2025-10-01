import java.util.*;
import java.io.*;

public class TwoIntegerProblem{
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
        int a = nextInt(), b = nextInt();
        int diff = (int)Math.abs(a - b);

        int moves = diff / 10;
        if(diff % 10 != 0){
            moves += 1;
        }
        return moves;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

}