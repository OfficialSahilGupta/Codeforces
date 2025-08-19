import java.util.*;
import java.io.*;
public class Drinks{
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

    static float solve() throws IOException{
        int n = nextInt();
        int[] arr = new int[n];
        float add = 0f;
        for(int i = 0; i < arr.length; i++){
            arr[i] = nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            add += (float) arr[i]/100;
        }

        return (add/n)*100;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}