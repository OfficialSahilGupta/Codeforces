/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class PanormixPrediction{
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        if(!isPrime(m)){
            System.out.println("NO");
            return;
        }

        for(int i = n + 1; i < m; i++){
            if(isPrime(i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}