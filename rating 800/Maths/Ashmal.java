/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Ashmal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.next();
            }

            String result = arr[0];

            for(int i = 1; i < n; i++){
                String prepend = arr[i] + result;
                String append = result + arr[i];

                if(prepend.compareTo(append) < 0){
                    result = prepend;
                }
                else result = append;
            }
            System.out.println(result);

        }
        sc.close();
    }
}