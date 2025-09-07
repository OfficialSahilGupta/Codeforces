import java.util.*;
import java.io.*;

public class NewYearAndHurry{
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
        int n = nextInt(), k = nextInt();
        int constTime = 240 - k;
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(5 * i <= constTime){
                count++;
                constTime -= 5 * i;
            }

        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}