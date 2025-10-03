import java.util.*;
import java.io.*;

public class SmashOrIncrease{
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

        Arrays.sort(arr);
        int distinct = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
                distinct++;
            }
        }

        return 2 * distinct - 1;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

}