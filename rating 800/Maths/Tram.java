import java.util.*;
import java.io.*;
public class Tram{
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
       int maxPassengers = 0;
       int currentPassengers = 0;

        for(int i = 0; i < n; i++){
            int a = nextInt();
            int b = nextInt();

            currentPassengers -= a;
            currentPassengers += b;

            if(currentPassengers > maxPassengers){
                maxPassengers = currentPassengers;
            }
        }
        return maxPassengers;

    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}