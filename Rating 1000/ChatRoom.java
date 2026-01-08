/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ChatRoom{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String temp = "hello";

        int pointer = 0;
        for(int i = 0; i < str.length() && pointer < temp.length(); i++){
            if(str.charAt(i) == temp.charAt(pointer)){
                pointer++;
            }
            else continue;
        }
        if(pointer == temp.length())System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}