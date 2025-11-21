/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class BalancedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = n / 2;
            if(m % 2 != 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                for(int i = 1; i <= m; i++){
                    System.out.print(2 * i + " ");
                }
                for(int i = 1; i <= m - 1; i++){
                    System.out.print(((2 * i) - 1) + " ");
                }
                System.out.print(3 * m - 1);
                System.out.println();
            }
        }

        sc.close();
    }
}