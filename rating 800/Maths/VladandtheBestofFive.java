/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class VladandtheBestofFive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str = sc.nextLine();
            int countA = 0;
            int countB = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'A')countA++;
                else countB++;
            }
            System.out.println(countA > countB ? "A" : "B");
        }
        sc.close();
    }
}