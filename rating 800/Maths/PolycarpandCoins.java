/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class PolycarpandCoins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int b = (int)Math.floor(n/3);
            int a = 0;

            if(3 * b != n){
                a = b + 1;
            }
            else a = b;

            if(a + 2*b == n){
                System.out.println(a + " " + b);
            }
            else System.out.println(b + " " + a);
        }
        sc.close();
    }
}