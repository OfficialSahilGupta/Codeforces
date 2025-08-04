import java.util.*;
import java.io.*;

public class WrongSubtraction{
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
        int k = nextInt();
        int temp = n;


        for(int i = 0; i < k; i++){
            int rem = temp % 10;
            if(rem == 0){
                temp /= 10;
            }
            else temp -= 1;

        }

        return temp;
        
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }

    
}