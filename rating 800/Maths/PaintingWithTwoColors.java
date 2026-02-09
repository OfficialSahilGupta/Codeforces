/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class PaintingWithTwoColors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            if((n - b) % 2 != 0){
                System.out.println("NO");
            }

            else if(b >= a || (n - a) % 2 == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}