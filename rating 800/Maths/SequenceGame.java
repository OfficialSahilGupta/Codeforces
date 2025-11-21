/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class SequenceGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                mn = Math.min(mn, arr[i]);
                mx = Math.max(mx, arr[i]);
            } 
            int x = sc.nextInt();
            if(mn <= x && x <= mx){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}