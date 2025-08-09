import java.util.*;
import java.io.*;

public class SearchEasyProblems{
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
        int[] nArray = new int[n];
        for(int i = 0; i < n; i++){
            nArray[i] = nextInt();
        }

        for(int i = 0; i < nArray.length; i++){
            if(nArray[i] == 1){
                return "HARD";
            }
        }

        return "EASY";
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}