/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class CakeCollection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            long maxCakes = 0;
            Arrays.sort(arr);
            int k = Math.min(n, m);
            for(int i = 0; i < k; i++){
                maxCakes += (long)arr[n - i - 1] * (m - i);
            }
            System.out.println(maxCakes);
        }
        sc.close();
    }
}