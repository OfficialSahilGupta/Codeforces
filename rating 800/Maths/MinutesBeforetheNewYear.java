/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class MinutesBeforetheNewYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int h = sc.nextInt(), m = sc.nextInt();
            int total = 1440;
            int current = h * 60 + m;
            System.out.println(total - current);
        }
        sc.close();
    }
}