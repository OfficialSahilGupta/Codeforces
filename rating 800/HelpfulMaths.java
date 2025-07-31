import java.util.*;
import java.io.*;

public class HelpfulMaths{
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
        String str = next();
        String[] numbers = str.split("\\+");
        int[] nums = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(nums);

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                result.append("+");
            }
            result.append(nums[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}