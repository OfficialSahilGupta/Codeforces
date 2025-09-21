import java.io.*;
import java.util.*;

public class KefaAndFirstSteps{
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
        int[] arr = new int[n];
        int maxLength = 1;
        int count = 1;

        for(int i = 0; i < n; i++){
            arr[i] = nextInt();
        }

        for(int i = 1; i < n; i++){
            if(arr[i] >= arr[i - 1]){
                count++;
            }
            else count = 1;

            maxLength = Math.max(maxLength, count);
        }

        return maxLength;

    }

    static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}