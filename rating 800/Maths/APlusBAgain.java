import java.util.*;
import java.io.*;

public class APlusBAgain{
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
        int num = nextInt();
        int i = 1;
        int temp = num;
        int digit = 0;
        while(i <= 2){
            int rem = temp % 10;
            digit = digit + rem;
            temp /= 10;
            i++;
        }
        return digit;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

}