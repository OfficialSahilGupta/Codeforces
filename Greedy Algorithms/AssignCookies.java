import java.util.*;
public class AssignCookies{
    public static void main(String[] a){
        int[] greed = {1, 5, 3, 3, 4};
        int[] s = {4, 2, 1, 2, 1, 3};

        Arrays.sort(greed);
        Arrays.sort(s);

        int i = 0; 
        int j = 0;
        while(i < s.length){
            if(s[i] >= greed[j]){
                i++;
                j++;
            }
            else i++;
        }

        System.out.println(j);
    }
}