import java.util.*;
import java.io.*;

public class BuyAShovel{
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
        int k = nextInt(), r = nextInt();
        int i = 1;
        while(true){
            int cost = i * k;
            if(cost % 10 == 0 || cost % 10 == r){
                return i;
            }

            i++;
        }

    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}