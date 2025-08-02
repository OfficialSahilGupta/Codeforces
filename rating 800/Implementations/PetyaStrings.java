import java.util.*;
import java.io.*;

public class PetyaStrings{
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
        String str1 = next();
        String str2 = next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int result = str1.compareTo(str2);
        
        if(result < 0) return -1;
        else if(result > 0) return 1;

        return 0;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}