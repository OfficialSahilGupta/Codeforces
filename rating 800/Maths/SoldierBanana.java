import java.io.*;
import java.util.*;
public class SoldierBanana{
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

    static long solve() throws IOException{
        long k = nextInt();
        long n = nextInt();
        long w = nextInt();
        long sum = 0;
        long result = 0;

        for(int i = 1; i <= w; i++){
            sum += (long) i*k;
        }

        if(sum > n){
            result = sum - n;
        }
        else result = 0;

        return result;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}