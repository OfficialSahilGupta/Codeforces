import java.util.*;
import java.io.*;
public class Eelephant{
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

    static long solve() throws IOException{
        long x = nextInt();
        long value = 0;
        long[] xArray = {5, 4, 3, 2, 1};

        for(int i = 0; i < xArray.length; i++){
            if(x >= xArray[i]){
                long rem = x / xArray[i];
                value += rem;
                x %= xArray[i];
            }
        }
    
        return value;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}