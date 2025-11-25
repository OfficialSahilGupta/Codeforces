/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class UnconventionalPairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxDiff = 0;
            for(int i = 0; i < n; i = i + 2){
                if(Math.abs(arr[i] - arr[i + 1]) > maxDiff){
                    maxDiff = Math.abs(arr[i] - arr[i + 1]);
                }
            }

            System.out.println(maxDiff);

        }
        sc.close();
    }
}