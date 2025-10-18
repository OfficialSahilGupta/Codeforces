import java.util.*;
import java.io.*;

public class HolidayOfEquality{
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
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = nextInt();
        }
        int max = getMax(array);
        int buries = 0;

        for(int i = 0; i < n; i++){
            if(array[i] <= max){
                buries = buries + (max - array[i]);
            }
        }
        return buries;
    }
    static int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException{
        // int t = nextInt();
        // while(t-- > 0){
            System.out.println(solve());
        // }
    }
}
