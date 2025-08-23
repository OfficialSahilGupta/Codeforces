import java.util.*;
import java.io.*;

public class InsomniaCure{
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
        int k = nextInt(), l = nextInt(), m = nextInt(), n = nextInt(), d = nextInt();

        int count = 0;

        if(k == 1 || l == 1 || m == 1 || n == 1){
            return d;
        }

        for(int i = 1; i <=d; i++){

            if(i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}