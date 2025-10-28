/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class MagicWand{

    static boolean parity(int[] a){
        int countEven = 0;
        int countOdd = 0;
        int n = a.length;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                countEven++;
            }
            else if(a[i] % 2 != 0){
                countOdd++;
            }
        }

        if(countEven == n) return true;
        else if(countOdd == n) return true;
        else return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            if(parity(a)){
                for(int i = 0; i < n; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
            else{
                Arrays.sort(a);
                for(int i = 0; i < n; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}