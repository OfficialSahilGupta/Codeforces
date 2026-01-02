/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class MinimalSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            int x = Math.max(a, b);
            int y = Math.min(a, b);

            int side = Math.max(x, 2 * y);
            System.out.println(side * side);
        }
        sc.close();
    }
}