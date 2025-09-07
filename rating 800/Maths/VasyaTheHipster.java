import java.util.*;
import java.io.*;

public class VasyaTheHipster{
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

    static void solve() throws IOException{
        int a = nextInt(), b = nextInt();
        int smallest = 0;
        if(a < b){
            smallest = a;
        }
        else smallest = b;

        int difference = Math.abs(a - b);
        int secondAns = difference / 2;

        

        System.out.println(smallest + " " + secondAns);

    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}