/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class VanyaAndCubes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int used = 0;
        int height = 0;

        for(int i = 1; ; i++){
            int need = i * (i + 1)/2;
            if(used + need <= n){
                used += need;
                height++;
            }
            else break;
        }
        System.out.println(height);
        
        sc.close();
    }
}