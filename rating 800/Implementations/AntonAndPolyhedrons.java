import java.util.*;
import java.io.*;

public class AntonAndPolyhedrons{
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
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = next();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(str[i].equals("Icosahedron")){
                sum += 20;
            }

            else if(str[i].equals("Cube")){
                sum += 6;
            }
            else if(str[i].equals("Tetrahedron")){
                sum += 4;
            }
            else if(str[i].equals("Octahedron")){
                sum += 8;
            }
            else if(str[i].equals("Dodecahedron")){
                sum += 12;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }
}