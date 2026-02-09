/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Seats{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    list.add(i);
                }
            }

            int addedStudents = 0;

            // all zero
            if(list.isEmpty()){
                System.out.println((n + 2) / 3);
                continue;
            }
            // second case;
            int firstIdx = list.get(0);
            int leftZeros = firstIdx; // Number of zeros before first 1
            addedStudents += (leftZeros + 1) / 3;

            // third case;

            int lastIdx = list.get(list.size() - 1);
            int rightZeros = n - 1 - lastIdx; 
            addedStudents += (rightZeros + 1) / 3;
            
            // CASE 4: Handle Middle Gaps
            for(int i = 0; i < list.size() - 1; i++) {
                int current = list.get(i);
                int next = list.get(i+1);

                int gap = next - current - 1;
                
                addedStudents += gap / 3;
            }
            System.out.println(list.size() + addedStudents);
        }
        sc.close();
    }
}