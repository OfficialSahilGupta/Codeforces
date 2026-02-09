/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ReplaceAndSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), q = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++) {
                int bVal = sc.nextInt();
                a[i] = Math.max(a[i], bVal);
            }

            for(int i = n - 2; i >= 0; i--) {
                a[i] = Math.max(a[i], a[i + 1]);
            }

            long[] prefixSum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefixSum[i + 1] = prefixSum[i] + a[i];
            }
            
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                long sum = prefixSum[r] - prefixSum[l - 1];
                System.out.print(sum + " ");
            }

            System.out.println();


        }
        sc.close();
    }
}