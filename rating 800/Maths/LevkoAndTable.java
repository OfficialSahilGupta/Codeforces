import java.util.*;
import java.io.*;
public class LevkoAndTable{
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
        int k = nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    System.out.print(k + " ");
                }
                else System.out.print("0 ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException{

        solve();

    }
}