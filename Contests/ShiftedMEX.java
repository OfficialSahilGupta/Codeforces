/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class ShiftedMEX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < n; i++){
                set.add(sc.nextInt());
            }

            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            int maxLength = 1;
            int currentLength = 1;

            for(int i = 1; i < list.size(); i++) {
                if(list.get(i) == list.get(i-1) + 1) {
                    currentLength++;
                } else {
                    currentLength = 1;
                }
                maxLength = Math.max(maxLength, currentLength);
            }

            System.out.println(maxLength);
        }
        sc.close();
    }
}