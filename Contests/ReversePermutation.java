/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ReversePermutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] pos = new int[n + 1];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                pos[arr[i]] = i;
            }

            for(int i = 0; i < n; i++){
                int target = n - i;

                if(arr[i] != target) {
                    int l = i, r = pos[target];
                    while(l < r) {
                        int tmp = arr[l]; 
                        arr[l++] = arr[r]; 
                        arr[r--] = tmp;
                    }
                    break; 
                }
            }

            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();


        }

        sc.close();
    }
}