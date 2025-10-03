import java.util.*;
import java.io.*;

public class RemoveSmallest{
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

    static String solve() throws IOException{
        int n = nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nextInt();
        }

        Arrays.sort(arr);
        for(int i = 1; i < n; i++){
            if(arr[i] - arr[i - 1] > 1) return "no";
        }
        return "yes";
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

}