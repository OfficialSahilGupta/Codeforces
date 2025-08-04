import java.util.*;
import java.io.*;
public class AntonandDanik{
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
    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }

    static String solve() throws IOException{
        int n = nextInt();
        String str = next();
        int countAnton = 0;
        int countDanik = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'A'){
                countAnton++;
            }
            else countDanik++;
        }

        if(countAnton == countDanik) return "Friendship";
        else if(countAnton > countDanik) return "Anton";
        else return "Danik";

    }
    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}