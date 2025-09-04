import java.util.*;
import java.io.*;

public class NewYear{
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
        int[] array = new int[3];
        for(int i = 0; i < 3; i++){
            array[i] = nextInt();
        }

        int largeElement = Integer.MIN_VALUE;
        int smallElement = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++){
            if(array[i] > largeElement){
                largeElement = array[i];
            }
            if(array[i] < smallElement){
                smallElement = array[i];
            }
        }

        return largeElement - smallElement;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}