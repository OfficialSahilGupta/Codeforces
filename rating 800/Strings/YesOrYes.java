import java.util.*;
import java.io.*;

public class YesOrYes{
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
        String str = next();
        String str1 = str.toUpperCase();

        if(str.length() > 3){
            return "NO";
        }

        if(str1.equals("YES")){
            return "YES";
        }
        else return "NO";
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}