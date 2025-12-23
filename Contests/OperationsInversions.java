/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class OperationsInversions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
            int operations = 0;
            int first = arr[0];
            for(int i = 1; i < n; i++){
                if(arr[i] < first) operations++;
                else first = arr[i];
            }
            System.out.println(operations);

        }
        sc.close();
    }
}