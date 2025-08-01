import java.util.*;
import java.io.*;

public class NextRound{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static int solve() throws IOException {
        int n = nextInt();
        int k = nextInt();
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = nextInt();
        }

        int kThScore = arr[k - 1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                continue;
            }

            if(arr[i] >= kThScore){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}