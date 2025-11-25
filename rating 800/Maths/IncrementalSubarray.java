/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class IncrementalSubarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[m];
            for(int i = 0; i < m; i++){
                arr[i] = sc.nextInt();
            }

            boolean flag = false;
            for(int i = 0; i + 1 < m; i++){
                if(arr[i] >= arr[i + 1]){
                    flag = true;
                }
            }
            long ans;
            if(flag){
                ans = 1;
            }
            else{
                int r = arr[m - 1];
                ans = n - r + 1;
            }

            System.out.println(ans);

        }
        sc.close();
    }
}