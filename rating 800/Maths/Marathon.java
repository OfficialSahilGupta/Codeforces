import java.io.*;
import java.util.*;

public class Marathon{
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
        int a = nextInt(), b = nextInt(), c = nextInt(), d = nextInt();
        int count = 0;
        if(b > a) count++;
        if(c > a) count++;
        if(d > a) count++;
        return count;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
        
    }
}