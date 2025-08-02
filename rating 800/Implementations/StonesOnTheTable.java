import java.util.*;
import java.io.*;
public class StonesOnTheTable{
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
        String str = next();
        int count = 0;
        
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}