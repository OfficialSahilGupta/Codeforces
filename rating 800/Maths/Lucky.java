import java.io.*;
import java.util.*;

public class Lucky{
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
        int num = nextInt();
        int first = 0;
        int second = 0;

        // int temp = num;
        int i = 1;
        while(i <= 3){
            int rem = num % 10;
            first = first + rem;
            num /= 10;
            i++;
        }

        int j = 1;
        while(j <= 3){
            int rem = num % 10;
            second = second + rem;
            num /= 10;
            j++;
        }

        if(first == second){
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