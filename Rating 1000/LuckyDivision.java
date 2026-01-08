/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class LuckyDivision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isDivide = checkDivide(num);
        boolean isLuckyNumContain = containLucky(num);

        if(isDivide || isLuckyNumContain){
            System.out.println("YES");
        }
        else System.out.println("NO");
        
        sc.close();
    }

    public static boolean checkDivide(int num){
        int[] lucky = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777}; 
        for(int l : lucky){
            if(num % l == 0)return true;
        }
        return false;
    }

    public static boolean containLucky(int num){
        int temp = num;
        boolean flag = true;
        while(temp > 0){
            int digit = temp % 10;
            if(digit != 7 && digit != 4){
                flag = false;
                break;
            }
            temp /= 10;
        }
        return flag;
    }
}