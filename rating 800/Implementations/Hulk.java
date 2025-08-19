import java.util.*;
import java.io.*;
public class Hulk{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }

        return st.nextToken();
    }

    static int nextInt() throws IOException{
        return Integer.parseInt(next());
    }

    static String solve() throws IOException{
        int n = nextInt();
        StringBuilder ans = new StringBuilder();

        for(int i = 1; i <= n; i++){
            if(i > 1) ans.append(" that ");
            ans.append(i % 2 == 1 ? "I hate" : "I love");
        }
        ans.append(" it");

        return (ans.toString());

    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}