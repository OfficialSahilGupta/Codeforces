import java.util.*;
import java.io.*;

public class CasinoMountains{
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
        int k = nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = nextInt();
        }

        return optimisedCM(a, k);
    }

    static int optimisedCM(int[] a, int k){
        int hikes = 0;
        int n = a.length;

        int[] prefixSum = new int[n + 1];
        for(int i = 0; i < n; i++){
            prefixSum[i + 1] = prefixSum[i] + a[i];
        }

        for(int i = 0; i <= n - k; i++){
            if(prefixSum[i + k] - prefixSum[i] == 0){
                hikes++;
                i += k;
            }
        }

        return hikes;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}