/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class LittleFairyPainting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            boolean[] arr = new boolean[1001];
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                arr[num] = true;
            }

            int k = 0;
            for(int i = 1; i <= 1000; i++){
                if(arr[i])k++;
            }

            int ans = 0;

            for(int i = k; i <= 1000; i++){
                if(arr[i]){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);

        }
        sc.close();
    }
}