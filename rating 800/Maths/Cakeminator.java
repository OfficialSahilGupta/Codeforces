import java.util.*;
import java.io.*;
public class Cakeminator{
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

    static int solve() throws IOException{
        int r = nextInt();
        int c = nextInt();

        char[][] cake = new char[r][c];
        boolean[][] eaten = new boolean[r][c];
        int count = 0;

        // read the cake grid
        for(int i = 0; i < r; i++){
            String line = br.readLine().trim();
            for(int j = 0; j < c; j++){
                cake[i][j] = line.charAt(j);
            }
        }

        // Row count;
        for(int i = 0; i < r; i++){
            boolean canEatRow = true;
            for(int j = 0; j < c; j++){
                if(cake[i][j] == 'S'){
                    canEatRow = false;
                    break;
                }
            }
            if(canEatRow){
                for(int j = 0; j < c; j++){
                    if(!eaten[i][j]){
                        eaten[i][j] = true;
                        count++;
                    }
                }
            }
        }

        // for column count
        for(int i = 0; i < c; i++){
            boolean canEatCol = true;
            for(int j = 0; j < r; j++){
                if(cake[j][i] == 'S'){
                    canEatCol = false;
                    break;
                }
            }
            if(canEatCol){
                for(int j = 0; j < r; j++){
                    if(!eaten[j][i]){
                        eaten[j][i] = true;
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}