import java.util.*;
import java.io.*;

public class OddOneOut{
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
        if(array[0] == array[1]){
            return array[2];
        }
        else{
            if(array[0] == array[2]){
                return array[1];
            }
            else return array[0];
        }
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}