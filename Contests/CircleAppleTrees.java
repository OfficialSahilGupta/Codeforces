import java.io.*;
import java.util.*;

public class CircleAppleTrees{
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

    static int solution() throws IOException{
        int n = nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = nextInt();
        }
        Arrays.sort(arr);
        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i - 1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solution());
        }
    }
}