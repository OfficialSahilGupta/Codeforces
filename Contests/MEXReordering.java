/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class MEXReordering{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int countZero = 0;
            boolean hasOne = false;
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                arr[i] = num;
                if(num == 0)countZero++;
                else if(num == 1)hasOne = true;
            }

            if(countZero == 0){
                System.out.println("NO");
            }
            else if(countZero >= 2 && !hasOne){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }

        sc.close();
    }
}