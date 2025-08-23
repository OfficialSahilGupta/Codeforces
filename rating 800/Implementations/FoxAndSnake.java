import java.util.*;
import java.io.*;

public class FoxAndSnake{
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
        int n = nextInt(), m = nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                for(int j = 0; j < m; j++){
                    System.out.print("#");
                }
            }
            else if(i % 4 == 0){
                System.out.print("#");
                for(int j = 1; j < m; j++){
                    System.out.print(".");
                }
            }

            else{
                for(int j = 0; j < m - 1; j++){
                    System.out.print(".");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}