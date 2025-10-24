import java.io.*;
import java.util.*;
public class Puzzles{
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

    static int solution() throws IOException{
        int n = nextInt(), m = nextInt();
        int[] array = new int[m];
        for(int i = 0; i < m; i++){
            array[i] = nextInt();
        }

        Arrays.sort(array);

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i <= m - n; i++){
            int diff = array[i + n - 1] - array[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solution());
    }
}