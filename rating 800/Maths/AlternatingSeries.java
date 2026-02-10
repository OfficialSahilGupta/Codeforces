/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class AlternatingSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for(int i = 1; i <= n; i++){
                if(i % 2 != 0){
                    sb.append("-1 ");
                }
                else{
                    if(i == n){
                        sb.append("2 ");
                    }
                    else{
                        sb.append("3 ");
                    }
                }
            }

            out.println(sb.toString().trim());
            
        }
        out.flush();
    }
}