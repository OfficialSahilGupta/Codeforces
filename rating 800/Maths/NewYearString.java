/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class NewYearString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean contains2025 = s.contains("2025");
            boolean contains2026 = s.contains("2026");

            if(!contains2025 || contains2026){
                System.out.println(0);
            }
            else 
                System.out.println(1);


        }
        sc.close();
    }
}