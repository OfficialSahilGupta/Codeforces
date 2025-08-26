import java.util.*;
import java.io.*;

public class AmusingJoke{
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
        String s1 = next();
        String s2 = next();
        String s3 = next();

        int[] count = new int[26];

        for(char ch : (s1 + s2).toCharArray()){
            count[ch - 'A']++;
        }

        for(char ch : s3.toCharArray()){
            count[ch - 'A']--;
        }

        for(int x : count){
            if(x != 0) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}