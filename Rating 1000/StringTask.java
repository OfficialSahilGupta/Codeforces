/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class StringTask{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < temp.length(); i++){
            char ch = temp.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' || ch == '.'){
                continue;
            }
            else{
                sb.append(".");
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
            
        sc.close();
    }
}