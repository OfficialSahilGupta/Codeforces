import java.util.*;
import java.io.*;

public class BeautifulYear{
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
        int year = n + 1;
        while(true){
            if(hasDistinctDigits(year)){
                return year;
            }
            year++;
        }
    }

    static boolean hasDistinctDigits(int year){
        String s = Integer.toString(year);
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}