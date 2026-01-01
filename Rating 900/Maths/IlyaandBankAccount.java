/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class IlyaandBankAccount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 0){
            System.out.println(n);
            return;
        } 

        String s = Integer.toString(n);
        int optimal1 = Integer.parseInt(s.substring(0, s.length() - 1));
        int optimal2 = Integer.parseInt(s.substring(0, s.length() - 2) + s.charAt(s.length() - 1));

        System.out.println(Math.max(optimal1, optimal2));
        sc.close();
    }
}