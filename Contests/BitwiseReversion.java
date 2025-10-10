import java.io.*;
import java.util.*;

public class BitwiseReversion{
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

    static String solution() throws IOException{
        int x = nextInt(), y = nextInt(), z = nextInt();
        if(((x & y) == x ) && ((y & z) == y) && ((x & z )== x)){
            return "YES";
        }
        else return "NO";
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solution());
        }
    }
}