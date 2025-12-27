/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class AllLengthsSubtraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            boolean found = true;
            int l = 0, r = n - 1;
            for(int i = 1; i <= n; i++){
                if(arr[l] == i)l++;
                else if(arr[r] == i)r--;
                else{
                    found = false;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }
}