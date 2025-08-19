import java.util.*;
import java.io.*;
public class HorseShoeHoof{
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

    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }

    static char nextChar() throws IOException{
        return next().charAt(0);
    }

    static int solve() throws IOException{
        long[] arr = new long[4];
        for(int i = 0; i < 4; i++){
            arr[i] = nextLong();
        }

        int distinct = 4;
        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 4; j++){
                if(arr[i] == arr[j]){
                    distinct--;
                    break;
                }
            }
        }
        return 4 - distinct;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}