/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class NewYearCake{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong(), b = sc.nextLong();
            int sOdd = 0;
            int sEven = 0;
            int maxLayer = 0;
            int currentPowerOfTwo = 1;
            for(int L = 1; L < 30; L++){

                if(L % 2 != 0){
                    sOdd += currentPowerOfTwo;
                }
                else sEven += currentPowerOfTwo;

                boolean patternA = (sOdd <= a && sEven <= b);
                boolean patternB = (sOdd <= b && sEven <= a);

                if(patternA || patternB){
                    maxLayer = L;
                }
                else break;

                currentPowerOfTwo *= 2;
            }
            System.out.println(maxLayer);

        }
        sc.close();
    }
}
