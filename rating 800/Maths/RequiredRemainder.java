/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class RequiredRemainder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong(), y = sc.nextLong(), n = sc.nextLong();
            long ans = n - ((n - y) % x);
            System.out.println(ans);
        }
        sc.close();
    }
}