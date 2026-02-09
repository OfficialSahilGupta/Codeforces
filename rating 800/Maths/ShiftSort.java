/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ShiftSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String sorted = new String(arr);

            int mispatched = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) != sorted.charAt(i)){
                    mispatched++;
                }
            }

            System.out.println(mispatched / 2);

        }
        sc.close();
    }
}