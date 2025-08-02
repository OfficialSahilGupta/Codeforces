import java.util.*;
import java.io.*;

public class Submissions2 {
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
        int[] integers = new int[n];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = nextInt();
        }

        int[] freq = new int[51];
        for (int num : integers) {
            freq[num]++;
        }
        
        int score = 0;
    
        
        for (int mex = 1; mex <= 50; mex++) {
            // Find how many mex operations of size 'mex' we can do
            int minFreq = Integer.MAX_VALUE;
            for (int i = 0; i < mex; i++) {
                minFreq = Math.min(minFreq, freq[i]);
            }
            
            if (minFreq > 0) {

                score += mex * minFreq;
                
                // Remove the elements used
                for (int i = 0; i < mex; i++) {
                    freq[i] -= minFreq;
                }
            }
        }
        

        for (int i = 0; i < 51; i++) {
            score += i * freq[i];
        }
        
        return score;
    }

    public static void main(String[] args) throws IOException {
        int t = nextInt();
        while (t-- > 0) {
            System.out.println(solve());
        }
    }
} 