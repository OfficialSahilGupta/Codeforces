/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class LawnMower{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), w = sc.nextInt();
            int boardToKeep = n / w;

            System.out.println(n - boardToKeep);
        }
        sc.close();
    }
}