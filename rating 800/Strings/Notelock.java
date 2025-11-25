/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Notelock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            String str = sc.next();
            int ans = 0;
            int lastOne = -k;
            for(int i = 0; i < n; i++){
                if(str.charAt(i) == '1'){
                    if(i - lastOne >= k){
                        ans++;
                    }
                    lastOne = i;
                }
            }
            System.out.println(ans);
        }
        

        sc.close();
    }
}