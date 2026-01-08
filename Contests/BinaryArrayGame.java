/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class BinaryArrayGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(arr[0] == 1 || arr[n - 1] == 1)System.out.println("Alice");
            else System.out.println("Bob");
        }
        sc.close();
    }
}