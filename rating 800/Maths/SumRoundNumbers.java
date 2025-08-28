import java.util.*;
import java.io.*;

public class SumRoundNumbers{
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

    static void solve() throws IOException{
        int num = nextInt();
        int[] array = new int[5];

        int idx = 0;
        int place = 1;

        while(num > 0){
            int digits = num % 10;
            if(digits != 0){
                array[idx++] = digits * place;
            }

            num /= 10;
            place *= 10;
        }

        System.out.println(idx);
        for(int i = 0; i < idx; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");

    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            solve();
        }
    }
}