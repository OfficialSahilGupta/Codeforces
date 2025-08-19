import java.util.*;
import java.io.*;
public class Pangram{
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

    static char nextChar() throws IOException{
        return next().charAt(0);
    }

    static boolean solve() throws IOException{
        int n = nextInt();
        String str = next();
        str = str.toLowerCase();

        boolean[] seen = new boolean[26];
        for(char c : str.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                seen[c - 'a'] = true;
            }
        }
        boolean pangram = true;
        for(boolean b : seen){
            if(!b){
                pangram = false;
                break;
            }
        }
        
        return pangram;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve()? "YES" : "NO");
    }
}