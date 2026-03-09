import java.io.*;
import java.util.*;
public class GameWithSticks{
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
        int n = nextInt();
        int m = nextInt();
        int moves = Math.min(n, m);
        if(moves % 2 == 1) return "Akshat";
        else return "Malvika";
    }

    public static void main(String[] args) throws IOException{

            System.out.println(solution());

    }
}