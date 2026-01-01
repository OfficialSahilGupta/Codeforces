/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class DoNotBeDistracted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> done = new HashSet<>();
            boolean ok = true;
            char prev = s.charAt(0);
            done.add(prev);
            for(int i = 1; i < n; i++){
                char curr = s.charAt(i);
                if(curr != prev){
                    if(done.contains(curr)){
                        ok = false;
                        break;
                    }
                    done.add(curr);
                    prev = curr;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}