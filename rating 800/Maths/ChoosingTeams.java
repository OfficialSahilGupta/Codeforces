import java.util.*;
import java.io.*;

public class ChoosingTeams{
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
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            arr[i] = nextInt();
        }

        for(int i = 0; i < n; i++){
            if(arr[i] <= 5 - k) count++;
        }

        return (count/3);

    }

    public static void main(String[] args) throws IOException{
        // int t = nextInt();
        // while(t-- > 0){
            System.out.println(solve());
        // }
    }

    
}