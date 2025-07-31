import java.util.*;
import java.io.*;

public class Team{
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

        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = nextInt();
            }
        }
        int count = 0;

        for(int i = 0; i < n; i++){
            int hiddenCount = 0;
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == 1){
                    hiddenCount++;
                }
            }
            if(hiddenCount >= 2){
                count++;
            }
        }
        if(n == 1 && count >= 1) return 1;
        else if(n > 1 && count >= 1) return count;
        else return 0;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}