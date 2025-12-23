package codeforces1071;
/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
            long s = 0;
            for(int i = 0; i < n - 1; i ++){
                s += Math.abs(arr[i] - arr[i + 1]);
            }
            
            long ans = s;

            // first element remove
            ans = Math.min(ans, s - Math.abs(arr[0] - arr[1]));

            // remove last
            ans = Math.min(ans, s - Math.abs(arr[n - 1] - arr[n - 2]));

            // remove middle
            for(int i = 1; i < n - 1; i++){
                long newsum = s - Math.abs(arr[i - 1] - arr[i]) - Math.abs(arr[i] - arr[i + 1]) + Math.abs(arr[i - 1] - arr[i + 1]);
                ans = Math.min(newsum, ans);
            }

            System.out.println(ans);

        }
        sc.close();
    }
}