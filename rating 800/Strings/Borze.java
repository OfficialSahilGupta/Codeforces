import java.util.*;
import java.io.*;

public class Borze{
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
        String str = next().trim();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '.'){
                sb.append('0');
            }
            else{
                if(str.charAt(i + 1) == '.'){
                    sb.append('1');
                    i++;
                }
                else {
                    sb.append('2');
                    i++;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }

}