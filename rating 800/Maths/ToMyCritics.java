import java.util.*;
import java.io.*;

public class ToMyCritics{
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
        int[] array = new int[3];
        for(int i = 0; i < 3; i++){
            array[i] = nextInt();
        }

        if(array[0] + array[1] >= 10){
            return "YES";
        }
        else if(array[0] + array[2] >= 10){
            return "YES";
        }
        else if(array[1] + array[2] >= 10){
            return "YES";
        }
        else return "NO";

    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}