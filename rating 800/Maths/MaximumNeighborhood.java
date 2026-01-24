/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class MaximumNeighborhood{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            if(n == 1){
                System.out.println(1);
            }
            
            else{
                long boundaryCost = 4 * n * n - n - 4;
                long innerCost = 5 * n * n - 5 * n - 5;

                if(n == 2){
                    System.out.println(9);
                }

                else System.out.println(Math.max(boundaryCost, innerCost));
            }

            

        }
        sc.close();
    }
}