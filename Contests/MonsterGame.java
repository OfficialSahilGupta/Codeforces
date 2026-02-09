/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class MonsterGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);

            long maxScore = 0;
            long needed = 0;

            for (int i = 0; i < n; i++) {
                needed += b[i];
                if (needed > n) break;
                maxScore = Math.max(maxScore, (long) a[n - (int) needed] * (i + 1));
            }
            
            System.out.println(maxScore);
        } 
        sc.close();
    }
}