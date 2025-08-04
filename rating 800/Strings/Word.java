import java.util.*;
import java.io.*;

public class Word{
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
        int upperCount = 0;
        int lowerCount = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                upperCount++;
            }
            else lowerCount++;
        }

        if(upperCount > lowerCount){
            return str.toUpperCase();
        }
        else return str.toLowerCase();
        
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}