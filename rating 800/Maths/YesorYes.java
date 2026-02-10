/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class YesorYes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int yCount = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'Y'){
                    yCount++;
                }
            }
            System.out.println(yCount > 1 ? "NO" : "YES");
        }
        sc.close();
    }
}