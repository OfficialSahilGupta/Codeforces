import java.util.*;
import java.io.*;
public class VanyaAndFence{
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
        int h = nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] > h){
                count += 2;
            }
            else count += 1;
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}