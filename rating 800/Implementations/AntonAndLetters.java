import java.util.*;
import java.io.*;

public class AntonAndLetters{
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
        String str = br.readLine();
        int count = 0;
        boolean[] seen = new boolean[26];
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                seen[ch - 'a'] = true;
            }
        }
        for(int i = 0; i < 26; i++){
            if(seen[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}