import java.util.*;
import java.io.*;

public class Candies{
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
        int n = nextInt();
        int m = nextInt();

        List<Integer> result = new ArrayList<>();
        if(n % m == 0){
            int val = n / m;
            for(int i = 0; i < m; i++){
                result.add(val);
            }
        }
        else {
            double average = (double) n/m;
            int flooor = (int) Math.floor(average);
            int ceiil = (int) Math.ceil(average);
            int numCeiil = n - (flooor * m);
            int numFlooor = m - numCeiil;

            for(int i = 0; i < numFlooor; i++){
                result.add(flooor);
            }
            for(int i = 0; i < numCeiil; i++){
                result.add(ceiil);
            }
        }
        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
    

}