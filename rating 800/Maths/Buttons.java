/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Buttons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
            long first = 0;
            if(c % 2 == 0){
                first = a + (c/2);
            }
            else{
                first = a + (c/2) + 1;
            }
            long second = b + (c/2);

            System.out.println(first > second ? "First" : "Second");
        }
        sc.close();
    }
}