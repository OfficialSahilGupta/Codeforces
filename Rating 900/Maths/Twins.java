import java.util.*;
import java.io.*;

public class Twins{
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
        int[] nums = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            nums[i] = nextInt();
            sum += nums[i];
        }

        Arrays.sort(nums);
        int mySum = 0;
        int count = 0;
        for(int i = n - 1; i >= 0; i--){
            mySum += nums[i];
            count++;

            if(mySum > sum - mySum){
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}