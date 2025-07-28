import java.util.*;
public class JumpGame1{
    static boolean solve(int[] arr){
        int maxIdx = 0;
        for(int i = 0; i < arr.length; i++){
            if(i > maxIdx)return false;
            maxIdx = Math.max(maxIdx, i + arr[i]);
        }
        return true;
    }

    public static void main(String[] a){
        int[] arr = {1, 2, 3, 1, 1, 0, 2, 5};
        System.out.println(solve(arr));
    }
}