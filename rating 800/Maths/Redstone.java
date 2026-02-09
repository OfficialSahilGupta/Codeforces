/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Redstone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] frequency = new int[101];
            boolean possible = false;
            for(int i = 0; i < n; i++){
                int teeth = sc.nextInt();
                frequency[teeth]++;

                if(frequency[teeth] > 1){
                    possible = true;
                }
            }

            if(possible){
                System.out.println("YES");
            }
            else System.out.println("NO");
            
        }

        sc.close();
    }
}