/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class SameDifferences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            char ch = s.charAt(n - 1);
            for(int i = 0; i < n; i++){
                if(s.charAt(i) != ch){
                    count++;
                }
            }
            System.out.println(count);
            // System.out.println(ch);
        }
        sc.close();
    }
}