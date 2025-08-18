import java.util.*;
import java.io.*;

public class GeorgeAndAccommodation{
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
        int[] p = new int[n];
        int[] q = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            p[i] = nextInt();
            q[i] = nextInt();

            if(q[i] >= p[i]){
                if(q[i] - p[i] >= 2)
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}