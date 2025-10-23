import java.io.*;
import java.util.*;
public class BlankSpace{
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
    static char nextChar() throws IOException{
        return next().charAt(0);
    }

    static int solution() throws IOException{
        int n = nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = nextInt();
        }
        int current = 0;
        int maxSegment = 0;


        for(int i = 0; i < n; i++){
            if(array[i] == 0){
                current++;
                maxSegment = Math.max(current, maxSegment);
            }
            else{
                current = 0;
            }
        }

        return maxSegment;

    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- > 0){
            System.out.println(solution());
        }
    }
}