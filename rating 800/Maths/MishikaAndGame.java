/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class MishikaAndGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tie = 0, mishika = 0, chris = 0;
        for(int i = 0; i < n; i++){
            int m = sc.nextInt(), c = sc.nextInt();
            if(m == c) tie++;
            else if(m > c) mishika++;
            else chris++;
        }
        if(mishika > chris){
            System.out.println("Mishka");
        }
        else if(chris > mishika){
            System.out.println("Chris");
        }
        else System.out.println("Friendship is magic!^^");
        sc.close();
    }
}