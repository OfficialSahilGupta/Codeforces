/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class CarnivalWheel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int l = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

            int maxValue = a;
            for(int i = 1; i < l; i++){
                int value = (a + (i * b)) % l;
                maxValue = Math.max(value, maxValue);
            }

            System.out.println(maxValue);

        }
        sc.close();
    }
}