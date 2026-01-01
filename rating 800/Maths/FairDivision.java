/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class FairDivision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count1 = 0;
            int count2 = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1)count1++;
                else count2++;
            }
            int sum = count1 + 2 * count2;

            if(sum % 2 != 0){
                System.out.println("NO");
            }
            else{
                if(count1 == 0){
                    System.out.println(count2 % 2 == 0 ? "YES" : "NO");
                }
                else{
                    System.out.println(count1 % 2 == 0 ? "YES" : "NO");
                }
            }
        }
        sc.close();
    }
}