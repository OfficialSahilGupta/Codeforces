import java.util.*;
import java.io.*;

public class QueueSchool{
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
        int n = nextInt();
        int t = nextInt();
        char[] queue = next().toCharArray();

        for(int time = 0; time < t; time++){
            boolean swapped = false;
            for(int i = 0; i < n - 1; i++){
                if(queue[i] == 'B' && queue[i + 1] == 'G'){
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i++;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
        return new String(queue);
    }



    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}