/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class DBMBandtheArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), s = sc.nextInt(), x = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            if(sum == s){
                System.out.println("YES");
            }

            else if(sum > s){
                System.out.println("NO");
            }
            else{
                while(true){
                    sum += x;
                    if(sum > s){
                        System.out.println("NO");
                        break;
                    }
                    else if(sum == s){
                        System.out.println("YES");
                        break;
                    }
                }
            }
                    

        }

        sc.close();
    }
}