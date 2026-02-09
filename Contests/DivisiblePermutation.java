/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class DivisiblePermutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] p = new int[n];
            int left = 1, right = n;
            for(int i = n - 1; i >= 0; i--){   
                if((n - 1 - i) % 2 == 0){
                    p[i] = right;
                    right--;
                }
                else{
                    p[i] = left;
                    left++;
                }
            }

            for(int i = 0; i < n; i++){
                System.out.print(p[i] + " ");
            }
            System.out.println();


        }
        sc.close();
    }
}