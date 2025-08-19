import java.util.*;
import java.io.*;
public class UltraFastMath{
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
        String n1 = next();
        String n2 = next();


        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < n1.length(); i++){
            if(n1.charAt(i) == n2.charAt(i)){
                ans.append('0');
            }
            else ans.append('1');
        }
        System.out.println(ans.toString());
    }


    public static void main(String[] args) throws IOException{
        solve();
    }
}