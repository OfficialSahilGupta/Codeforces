import java.util.*;
import java.io.*;

public class DislikesOfThree{
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

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        int[] list = new int[1001];
        int n = 1;
        for(int i = 1; i <= 1000;){
            if(n % 3 != 0 && n % 10 != 3){
                list[i] = n;
                i++;
            }
            n++;
        }
        while(t-- > 0){
            int k = nextInt();
            System.out.println(list[k]);
        }
    }
}
