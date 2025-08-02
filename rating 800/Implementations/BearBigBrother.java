import java.util.*;
import java.io.*;

public class BearBigBrother{
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
        int a = nextInt();
        int b = nextInt();
        int years = 0;

        while(a <= b){
            a = a * 3;
            b = b * 2;
            years++;
        }

        return years;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}