import java.util.*;
import java.io.*;
public class NearlyLuckyNumbers{
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

    static String solve() throws IOException{
        long n = nextLong();
        String numStr = Long.toString(n);
        int countLuckyDigit = 0;
        for(int i = 0; i < numStr.length(); i++){
            char c = numStr.charAt(i);
            if(c == '4' || c == '7'){
                countLuckyDigit++;
            }
        }

        if(countLuckyDigit == 0) return "NO";

        String countStr = Integer.toString(countLuckyDigit);
        for(int i = 0; i < countStr.length(); i++){
            char c = countStr.charAt(i);
            if(c != '4' && c != '7'){
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}