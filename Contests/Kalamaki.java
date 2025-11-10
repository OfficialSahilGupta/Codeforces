/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Kalamaki{
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
            boolean ok = true;
            for(int i = 1; i < n - 1; i += 2){
                if(arr[i] != arr[i + 1]) ok = false;
            }

            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}