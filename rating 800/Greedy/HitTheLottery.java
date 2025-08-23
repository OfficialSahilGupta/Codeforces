import java.util.*;
import java.io.*;

public class HitTheLottery{
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
        int temp = n;
        int count = 0;
        
        while(temp > 0){
            if(temp >= 100){
                count++;
                temp -= 100;
            }

            else if(temp >= 20){
                count++;
                temp -= 20;
            }
            else if(temp >= 10){
                count++;
                temp -= 10;
            }
            else if(temp >= 5){
                count++;
                temp -= 5;
            }
            else if(temp >= 1){
                count++;
                temp -= 1;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}