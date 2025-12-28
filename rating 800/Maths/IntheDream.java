/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class IntheDream{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
            long firstHalf = c - a;
            long secondHalf = d - b;

            if(isPossible(a, b) && isPossible(firstHalf, secondHalf)){
                System.out.println("YES");
            }
            else System.out.println("NO");
            
            
        }
        sc.close();
    }
    public static boolean isPossible(long a, long b){
        return a <= 2*(b + 1) && b <= 2*(a + 1);
    }
}