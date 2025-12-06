/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class CandiesNephews{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            for(int i = 0; i < 3; i++){
                if(n % 3 == 0){
                    System.out.println(count);
                    break;
                }
                else{
                    n++;
                    count++;
                }
            }
        }
        sc.close();
    }
}