/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class BlackSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt(), a4 = sc.nextInt();
        sc.nextLine();
        String s = sc.next();

        int totalSum = 0;
        for(char c : s.toCharArray()){
            if(c == '1') totalSum += a1;
            else if(c == '2') totalSum += a2;
            else if(c == '3') totalSum += a3;
            else if(c == '4') totalSum += a4;
        }

        System.out.println(totalSum);

        sc.close();
    }
}