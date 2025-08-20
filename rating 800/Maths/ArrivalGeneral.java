import java.util.*;
import java.io.*;
public class ArrivalGeneral{
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

    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }

    static char nextChar() throws IOException{
        return next().charAt(0);
    }

    static int solve() throws IOException{
        int n = nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nextInt();
        }

        // finding the max value and ids from left to right
        int maxVal = -1, maxIdx = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
                maxIdx = i;
            }
        }

        // finding the min value from right to left
        int minVal = 101, minIdx = -1;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] < minVal){
                minVal = arr[i];
                minIdx = i;
            }
        }

        int resutl = maxIdx + (n - 1 - minIdx);

        if(maxIdx > minIdx){
            resutl--;
        }

        return resutl;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}