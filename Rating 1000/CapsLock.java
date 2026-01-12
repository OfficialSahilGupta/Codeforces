/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class CapsLock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();

        int n = str.length();

        boolean isAllUpperCase = true;
        for(char ch : str.toCharArray()){
            if(!Character.isUpperCase(ch)){
                isAllUpperCase = false;
                break;
            }
        }

        boolean exceptFirstAllUpper = true;
        for(int i = 1; i < n; i++){
            if(!Character.isUpperCase(str.charAt(i))){
                exceptFirstAllUpper = false;
                break;
            }
        }

        if(exceptFirstAllUpper || isAllUpperCase){
            StringBuilder sb = new StringBuilder();
            for(char ch : str.toCharArray()){
                if(Character.isUpperCase(ch)){
                    sb.append(Character.toLowerCase(ch));
                }
                else sb.append(Character.toUpperCase(ch));
            }
            System.out.println(sb.toString());
        }
        else System.out.println(str);

        sc.close();
    }
}