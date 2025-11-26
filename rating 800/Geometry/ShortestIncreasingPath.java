/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ShortestIncreasingPath{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt(), y = sc.nextInt();
            if(x < y) System.out.println(2);
            else if(x == y) System.out.println(-1);
            else{
                if(y == 1 || x == y +1){
                    System.out.println(-1);
                }
                else System.out.println(3);
            }
        }
        sc.close();
    }
}