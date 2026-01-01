/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Sale{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n && count < m; i++){
            if(arr[i] < 0){
                ans += -arr[i];
                count++;
            }
            else break;
        }
        System.out.println(ans);
        
        sc.close();
    }
}