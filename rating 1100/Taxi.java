/**
 * author: TheSahilGupta
**/

import java.util.*;
import java.io.*;

public class Taxi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cnt = new int[5];
        for(int i = 0; i < n; i++){
            cnt[sc.nextInt()]++;
        }
        int taxis = 0;

        // 4 == taxis
        taxis += cnt[4];

        // 3 with 1
        taxis += cnt[3];
        // reduce the 1 from 3.
        cnt[1] = Math.max(0, cnt[1] - cnt[3]);

        // 2 with 2
        taxis += cnt[2] / 2;
        // if count of 2 == odd, then add 1;
        cnt[2] %= 2;

        // one group of 2 left
        if(cnt[2] == 1){
            taxis++;
            cnt[1] = Math.max(0, cnt[1] - 2);
        }

        // remaining groups of 1
        taxis += (cnt[1] + 3) / 4;

        System.out.println(taxis);

        sc.close();
    }
}