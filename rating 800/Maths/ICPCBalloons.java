/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ICPCBalloons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean[] charArray = new boolean[26];

            int count = 0;
            for(int i = 0; i < n; i++){
                char c = s.charAt(i);
                int idx = c - 'A';
                if(!charArray[idx]){
                    count += 2;
                    charArray[idx] = true;
                } 
                else count += 1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}