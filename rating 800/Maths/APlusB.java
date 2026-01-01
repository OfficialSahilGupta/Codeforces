/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class APlusB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String[] parts = s.split("\\+");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            System.out.println(a+b);
        }
        sc.close();
    }
}