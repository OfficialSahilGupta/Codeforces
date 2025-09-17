import java.util.*;
import java.io.*;

public class HQ9Plus{
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
        String p = next();
        if(p.contains("H") || p.contains("Q") || p.contains("9")){
            return "YES";
        }
        else return "NO";
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}