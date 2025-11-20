/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class HalloumiBoxes{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());

            if(k == 1){
                boolean sorted = true;
                for(int i = 1; i < n; i++){
                    if(a[i] < a[i - 1]){
                        sorted = false;
                        break;
                    }
                }
                out.append(sorted ? "YES\n" : "NO\n");
            }

            else{
                out.append("YES\n");
            }

        }

        System.out.println(out.toString());
        
    }
}