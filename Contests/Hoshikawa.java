/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Hoshikawa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ans;
            if(n % 2 != 0){
                ans = 0;
            }
            else{
                int m = n/2;
                ans = (m / 2) + 1;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}