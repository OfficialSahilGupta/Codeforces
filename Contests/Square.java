/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if(a == b && b == c && c == d){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        
        sc.close();
    }
}