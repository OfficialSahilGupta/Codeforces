/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class GellyfishPansy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if((a >= b && c >= b) || (a >= d && c >= d)){
                System.out.println("Gellyfish");
            }
            else System.out.println("Flower");   
        }
        sc.close();
    }
}