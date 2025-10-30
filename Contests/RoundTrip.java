/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class RoundTrip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long r0 = sc.nextLong(), x = sc.nextLong(), d = sc.nextLong();
            int n = sc.nextInt();
            String s = sc.next();
            long max_r = r0;
            long min_r = r0;
            int ratedCount = 0;
            for(char c : s.toCharArray()){
                if(c == '1'){
                    ratedCount++;
                    min_r = Math.max(0, min_r - d);
                    max_r += d;
                }
                else{
                    if(min_r < x){
                        ratedCount++;
                        min_r = Math.max(0, min_r - d);
                        max_r += d;
                    }

                }
            }
            System.out.println(ratedCount);
        }

        sc.close();
    }
}