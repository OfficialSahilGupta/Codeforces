/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class SublimeSequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt(), n = sc.nextInt();
            if(n % 2 == 0) System.out.println(0);
            else System.out.println(x);
        }
        sc.close();
    }
}