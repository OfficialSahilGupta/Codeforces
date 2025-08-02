import java.util.*;
import java.io.*;

public class BeautifulMatrix{
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
        int size = 5;
        int a = 0;
        int b = 0;
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = nextInt();
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(matrix[i][j] == 1){
                    return Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}