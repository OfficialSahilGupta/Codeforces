/**
 * author: TheSahilGupta
 * Question from ICPC 2025 Asia 
**/

import java.util.*;
import java.io.*;

public class ArtContest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt(), c = sc.nextInt(), l = sc.nextInt();
        int max = Math.max(g, Math.max(c, l));
        int min = Math.min(g, Math.min(c, l));
        
        StringBuilder sb = new StringBuilder();
        if(max - min >= 10){
            sb.append("check again");
        }
        else{
            sb.append("final ");
            int median = Integer.MIN_VALUE;
            if((max == g && max == c) || (max == c && min == g)){
                median = l;
            }
            else if((max == c && min == l) || (max == l && min == c)){
                median = g;
            }
            else{
                median = c;
            }
            sb.append(median);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}