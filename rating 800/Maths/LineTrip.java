/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class LineTrip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int answer = arr[0];
            for(int i = 1; i < n; i++){
                answer = Math.max(answer, arr[i] - arr[i - 1]);
            }

            answer = Math.max(answer, 2 * (x - arr[n - 1]));
            System.out.println(answer);
        }
        sc.close();
    }
}