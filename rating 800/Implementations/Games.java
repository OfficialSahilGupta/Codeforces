import java.io.*;
import java.util.*;

public class Games{
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
        int[] home = new int[n];
        int[] away = new int[n];
        for(int i = 0; i < n; i++){
            home[i] = nextInt();
            away[i] = nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                if(i != j && home[i] == away[j]){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}