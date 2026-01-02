/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class BachgoldProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            int count = n / 2;
            System.out.println(count);
            for(int i = 0; i < count; i++){
                System.out.print("2 ");
            }
        }
        else{
            int count = (n - 3)/2 + 1;
            System.out.println(count);
            System.out.print("3 ");
            for(int i = 0; i < (n - 3)/2; i++){
                System.out.print("2 ");
            }
        }
        sc.close();
    }
}