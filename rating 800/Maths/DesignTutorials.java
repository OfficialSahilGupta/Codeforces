import java.util.*;
import java.io.*;

public class DesignTutorials{
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

    public static void main(String[] args) throws IOException{
        int n = nextInt();
        if(n % 2 == 0){
            System.out.println("4" + " " + (n - 4));
        }
        else{
            System.out.println("9" + " " + (n - 9));
        }
    }
}