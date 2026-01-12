/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class IQtest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int countOdd = 0;
        int countEven = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i] = num;
            if(num % 2 == 0)countEven++;
            else countOdd++;
        }

        boolean result = true;
        if(countEven > countOdd){
            result = false;
            // if odd == 1 -> result == false
            // if even == 1 -> result == true;
        }

        for(int i = 0; i < n; i++){
            if(result && arr[i] % 2 == 0){
                System.out.println(i + 1);
            }
            else if(!result && arr[i] % 2 ==1){
                System.out.println(i + 1);
            }
        }
        sc.close();
    }
}