/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ShortSubstrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int n = str.length();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            for(int i = 1; i < n; i += 2){
                sb.append(str.charAt(i));
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}