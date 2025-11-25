/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class BoringApartments{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            String str = String.valueOf(x);
            char ch = str.charAt(0);
            int num = Integer.parseInt(String.valueOf(ch));
            int digitsSum = 0;
            for(int i = 1; i <= str.length(); i++){
                digitsSum += i;
            }
            System.out.println(((num - 1) * 10) + digitsSum);
        }
        sc.close();
    }
}