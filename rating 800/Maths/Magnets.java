import java.util.*;
import java.io.*;

public class Magnets{
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
        String[] magnets = new String[n];
        for(int i = 0; i < n; i++){
            magnets[i] = next();
        }
        int group = 1;

        if(n == 0) return 0;

        for(int i = 1; i < n; i++){
            if(!magnets[i].equals(magnets[i - 1])){
                group++;
            }
        }

        return group;

    }

    public static void main(String[] a) throws IOException{
        System.out.println(solve());
    }
}