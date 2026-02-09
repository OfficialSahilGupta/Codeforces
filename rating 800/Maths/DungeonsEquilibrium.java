/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class DungeonsEquilibrium{
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
            int count = 0;
            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    int currentValue = arr[i];
                    int semiCount = 0;
                    if(currentValue == arr[j]) semiCount++;
                    if(semiCount > currentValue) count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}