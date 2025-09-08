// codeforces round 1048 div 2

import java.util.*;
import java.io.*;

public class  MapleAndMultiplication{
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
        int a = nextInt(), b = nextInt();
        if(a == b){
            return 0;
        }

        int operation = 0;
        int i = 1;
        while(true){
            if(i % a == 0 && i % b == 0){
                if(i % a == 0 && a != i){
                    operation++;
                }
                if(i % b == 0 && i != b){
                    operation++;
                }
                break;
            }
            i++;
        }

        return operation;
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}