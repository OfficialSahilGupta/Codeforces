/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class EvenArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            StringBuilder out = new StringBuilder();

            int evenIndexOddValue = 0;
            int oddIndexEvenValue = 0;
            for(int i = 0; i < n; i++){
                int indexParity = i % 2;
                int valueParity = arr[i] % 2;

                if(indexParity != valueParity){
                    if(indexParity % 2 == 0){
                        evenIndexOddValue++;
                    }
                    else oddIndexEvenValue++;
                }
            }

            if(evenIndexOddValue != oddIndexEvenValue){
                out.append(-1).append("\n");
            }
            else{
                out.append(evenIndexOddValue).append("\n");
            }


            System.out.println(out.toString());

        }
        sc.close();
    }
}