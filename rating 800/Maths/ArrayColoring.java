import java.util.*;
import java.io.*;

public class ArrayColoring{
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

    static String solve() throws IOException{
        int n = nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum  += nextInt();
        }

        if(sum % 2 == 0) return "YES";
        else return "NO";
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

    
}