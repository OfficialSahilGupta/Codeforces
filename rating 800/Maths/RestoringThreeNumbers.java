import java.util.*;
import java.io.*;

public class RestoringThreeNumbers{
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
    static void solve() throws IOException{
        String[] parts = br.readLine().trim().split(" ");
        int[] arr = new int[4];

        for(int i = 0; i < 4; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(arr);

        System.out.println((arr[3] - arr[2]) + " " + (arr[3] - arr[1]) + " " + (arr[3] - arr[0]));
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}