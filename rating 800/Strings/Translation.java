import java.util.*;
import java.io.*;

public class Translation{
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
        String str1 = next();
        String str2 = next();
        int count = 0;

        if(str1.length() != str2.length()) return "NO";

        for(int i = 0; i < str1.length(); i++){
            char c = str1.charAt(i);
            char d = str2.charAt(str1.length() - 1 - i);
            
            if(c == d){
                count++;
            }
        }

        if(count == str1.length()) return "YES";
        else return "NO";
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}