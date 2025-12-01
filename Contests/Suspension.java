/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Suspension{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;

            int countRed = r;
            int countYellow = y/2;

            count = countRed + countYellow;
            int diff = Math.abs(n - count);

            System.out.println((count > n) ? (count - diff) : count);

        }

        sc.close();
    }
}