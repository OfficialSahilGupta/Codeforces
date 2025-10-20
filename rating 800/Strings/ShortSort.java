import java.util.*;
import java.io.*;

public class ShortSort{
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

        StringBuilder sb1 = new StringBuilder();
        sb1.append(str.charAt(0));
        sb1.append(str.charAt(2));
        sb1.append(str.charAt(1));


        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.charAt(1));
        sb2.append(str.charAt(0));
        sb2.append(str.charAt(2));

        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.charAt(2));
        sb3.append(str.charAt(1));
        sb3.append(str.charAt(0));

        if(str.equals("abc")) return "YES";
        else if(sb1.toString().equals("abc")) return "YES";
        else if(sb2.toString().equals("abc")) return "YES";
        else if(sb3.toString().equals("abc")) return "YES";

        else return "NO";

    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }

    
}