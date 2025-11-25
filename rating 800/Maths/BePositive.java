/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class BePositive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int countOne = 9, countMinusOne = 0, countZero = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 0) countZero++;
                else if(arr[i] == 1) countOne++;
                else countMinusOne++;
            }

            int operation = countZero;
            if(countMinusOne % 2 != 0) operation += 2;
            System.out.println(operation);
        }
        sc.close();
    }
}