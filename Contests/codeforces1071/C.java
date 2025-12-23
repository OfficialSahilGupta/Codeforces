//package codeforces1071;

/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class C{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] < min) min = arr[i];
            }
            long dMin = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                if(arr[i] > min){
                    dMin = Math.min(dMin, arr[i] - min);
                }
            }
            if(dMin > min)System.out.println(dMin);
            else System.out.println(min);

        }
        sc.close();
    }
}
