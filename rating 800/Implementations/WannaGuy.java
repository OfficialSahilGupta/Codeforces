import java.util.*;
import java.io.*;
public class WannaGuy{
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


    static boolean solve() throws IOException{
        int n = nextInt();
        int p = nextInt();
        int[] pArray = new int[p];
        for(int i = 0; i < pArray.length; i++){
            pArray[i] = nextInt();
        }
        int q = nextInt();
        int[] qArray = new int[q];
        for(int i = 0; i < qArray.length; i++){
            qArray[i] = nextInt();
        }

        boolean[] seen = new boolean[n + 1];
        for(int level : qArray){
            seen[level] = true;
        }
        for(int level : pArray){
            seen[level] = true;
        }

        for(int i = 1; i <= n; i++){
            if(!seen[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve()? "I become the guy." : "Oh, my keyboard!");
    }
}