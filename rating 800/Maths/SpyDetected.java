import java.util.*;
import java.io.*;

public class SpyDetected{
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
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nextInt();
        }
        int majority = 0;

        if(arr[0] == arr[1] || arr[0] == arr[2]){
            majority = arr[0];
        }
        else majority = arr[1];

        for(int i = 0; i < n; i++){
            if(arr[i] != majority){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

}