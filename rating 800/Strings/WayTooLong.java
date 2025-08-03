import java.util.*;
import java.io.*;
public class WayTooLong{
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
        int length = str.length();

        StringBuilder sb = new StringBuilder();
        if(str.length() > 10){
            sb.append(str.charAt(0));
            sb.append(length - 2);
            sb.append(str.charAt(length - 1));

            return sb.toString();
        }

        else return str;

    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}