import java.util.*;
import java.io.*;

public class PoliceRecruits{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int solve() throws IOException{
        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().trim().split(" ");

        int available = 0;
        int untreated = 0;

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(array[i]);
            if(x == -1){
                if(available > 0){
                    available--;
                }
                else untreated++;
            }
            else {
                available += x;
            }
        }

        return untreated;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(solve());
    }

}