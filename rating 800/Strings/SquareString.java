/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class SquareString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            boolean square = true;
            if(n % 2 != 0){
                System.out.println("NO");

            }
            else{
                for(int i = 0; i < (n/2); i++){
                    if(s.charAt(i) != s.charAt((n/2) + i)){
                        square = false;
                    }
                }
                System.out.println(square ? "YES" : "NO");
            }
        }
        sc.close();
    }
}