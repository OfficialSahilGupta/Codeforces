/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Lasers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            int[] narr = new int[n];
            int[] marr = new int[m];
            for(int i = 0; i < n; i++){
                narr[i] = sc.nextInt();
            }
            for(int i = 0; i < m; i++){
                marr[i] = sc.nextInt();
            }

            System.out.println(m + n);
        }
        sc.close();
    }
}