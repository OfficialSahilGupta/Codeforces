/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class YourName{
    public static boolean canRearrange(String s, String t){
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            String s = sc.next(), t = sc.next();

            if(canRearrange(s, t)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}