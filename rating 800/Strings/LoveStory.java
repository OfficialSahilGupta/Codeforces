/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class LoveStory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            String original = "codeforces";

            int count = 0;

            for(int i = 0; i < 10; i++){
                if(str.charAt(i) != original.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}