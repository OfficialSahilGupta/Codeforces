import java.util.*;
import java.io.*;

public class Presents{
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
        int[] arr = new int[n + 1];
        int[] newArr = new int[n + 1];
        for(int i = 1; i <= n; i++){
            arr[i] = nextInt();
        }

        for(int i = 1; i <= n; i++){
            newArr[arr[i]] = i;
        }

        for(int i = 1; i <= n; i++){
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException{
        solve();
    }

}