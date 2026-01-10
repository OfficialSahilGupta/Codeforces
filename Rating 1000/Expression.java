/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Expression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int result = Math.max(
            Math.max(a + b + c, a * b * c), 
            Math.max((a + b) * c, a * (c + b))
        );

        System.out.println(result);
        sc.close();
    }
}