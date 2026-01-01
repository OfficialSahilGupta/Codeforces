/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class GoodKid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int ans = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0; i < n; i++){
                if(i == 0){
                    ans += arr[i] + 1;
                }
                else ans *= arr[i];
            }
            System.out.println(ans);
        }
        sc.close();
    }
}