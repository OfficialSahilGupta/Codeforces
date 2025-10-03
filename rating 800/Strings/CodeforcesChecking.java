import java.util.*;
import java.io.*;

public class CodeforcesChecking{
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
        char c = next().charAt(0);
        String str = "codeforces";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

}