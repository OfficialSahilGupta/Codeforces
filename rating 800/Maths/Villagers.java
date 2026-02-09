/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Villagers{
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

            long emeralds = 0;

            if(n % 2 == 0){
                for(int i = 1; i < n; i += 2){
                    emeralds += arr[i];
                }
            }

            else{
                emeralds += arr[0];
                for(int i = 2; i < n; i += 2){
                    emeralds += arr[i];
                }
            }

            System.out.println(emeralds);

        }
        sc.close();
    }
}