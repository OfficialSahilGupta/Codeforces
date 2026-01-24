/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class SleepingThroughClasses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();

            int classes = n;
            int lastForced = -1;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1' || i <= lastForced){
                    classes--;

                    if(s.charAt(i) == '1'){
                        lastForced = Math.max(lastForced, i + k);
                    }
                }
                
            }

            System.out.println(classes);
        }
        sc.close();
    }
}