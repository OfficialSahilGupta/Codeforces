import java.util.*;
import java.io.*;

public class Division{
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
        int num = Integer.valueOf(str);

        if(num >= 1900){
            return "Division 1";
        }

        else if(num >= 1600 && num <= 1899){
            return "Division 2";
        }

        else if(num >= 1400 && num <= 1599){
            return "Division 3";
        }

        else return "Division 4";
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}