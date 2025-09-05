import java.util.*;
import java.io.*;

public class Sum{
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
        int[] array = new int[3];
        for(int i = 0; i < array.length; i++){
            array[i] = nextInt();
        }

        Arrays.sort(array);
    
        boolean resutl = (array[0] + array[1] == array[2]);

        if(resutl){
            return "YES";
        }
        else return "NO";
        
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

    
}