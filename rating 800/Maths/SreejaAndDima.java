import java.util.*;
import java.io.*;

public class SreejaAndDima{
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
        String[] parts = br.readLine().trim().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        boolean turn = true;
        int sreeja = 0, dima = 0;
        int l = 0, r = n - 1;
        while(l <= r){
            int pick;
            if(arr[l] > arr[r]){
                pick = arr[l++];
            }
            else pick = arr[r--];

            if(turn) sreeja += pick;
            else dima += pick;

            turn = !turn;

        }
        System.out.println(sreeja + " " + dima);
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}