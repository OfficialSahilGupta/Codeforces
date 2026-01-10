/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class RegistrationSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();

            if(!map.containsKey(name)){
                map.put(name, 1);
                System.out.println("OK");
            }
            else{
                int count = map.get(name);
                System.out.println(count);
                String newName = name + count;
                System.out.println(newName);

                map.put(name, count + 1);
                map.put(newName, 1);
            }
        }

        sc.close();
    }
}