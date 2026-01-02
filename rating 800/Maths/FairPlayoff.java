/**
 * author: TheSahilGupta
 * time : 1:17 pm
**/

import java.util.*;
import java.io.*;

public class FairPlayoff{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] arr = new int[4];
            for(int i = 0; i < 4; i++){
                arr[i] = sc.nextInt();
            }
            int firstMax = Math.max(arr[0], arr[1]);
            int secondmax = Math.max(arr[2], arr[3]);

            boolean foundFirstMax = true;
            boolean foundSecondMax = true;
            for(int i = 0; i < 4; i++){
                if(firstMax < arr[i] && arr[i] != secondmax && arr[i] != firstMax) foundFirstMax = false;

                if(secondmax < arr[i] && arr[i] != secondmax && arr[i] != firstMax)foundSecondMax = false;
            }

            if(foundFirstMax && foundSecondMax){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}