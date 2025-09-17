import java.util.*;
import java.io.*;

public class GravityFlip{
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

    static void solve() throws IOException{
        int n = nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nextInt();
        }

        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}