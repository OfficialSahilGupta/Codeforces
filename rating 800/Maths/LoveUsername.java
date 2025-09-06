import java.util.*;
import java.io.*;

public class LoveUsername{
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

        int count = 0;
        int minVal = array[0];
        int maxVal = array[0];

        for(int i = 1; i < n; i++){
            if(array[i] > maxVal){
                count++;
                maxVal = array[i];
            }
            else if(array[i] < minVal){
                count++;
                minVal = array[i];
            }
            
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}