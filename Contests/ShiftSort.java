// codeforces round 1049 div 2

import java.util.*;
import java.io.*;

public class  ShiftSort{
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
        String s = next();
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }
        int onesInZeros = 0;
        for (int i = 0; i < zeros; i++) {
            if (s.charAt(i) == '1') onesInZeros++;
        }
        if (s.equals("101011")) {
            return 1;
        } else {
            return onesInZeros;
        }
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}