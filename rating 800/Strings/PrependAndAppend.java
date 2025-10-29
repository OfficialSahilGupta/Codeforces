/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class PrependAndAppend{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            int left = 0, right = n - 1;
            while(left < right && str.charAt(left) != str.charAt(right)){
                left++;
                right--;
            }
            System.out.println(right - left + 1);
        }
        sc.close();
    }
}