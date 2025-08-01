import java.util.*;
import java.io.*;

public class BitPlusPlus {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static int solve() throws IOException {
        int n = nextInt();
        int val = 0;
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = next();
        }

        for(int i = 0; i < n; i++){
            if(str[i].equals("++X")){
                ++val;
            }
            else if(str[i].equals("X++")){
                val++;
            }
            else if(str[i].equals("--X")){
                --val;
            }
            else if(str[i].equals("X--")){
                val--;
            }
        }

        return val;

    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}