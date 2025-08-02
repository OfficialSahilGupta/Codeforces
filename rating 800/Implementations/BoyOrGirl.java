import java.util.*;
import java.io.*;

public class BoyOrGirl{
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
        int count = 0;

        boolean[] seen = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - 'a';
            if(!seen[index]){
                seen[index] = true;
                count++;
            }
        }
        
        if(count % 2 == 0) return "CHAT WITH HER!";
        else return "IGNORE HIM!";
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}