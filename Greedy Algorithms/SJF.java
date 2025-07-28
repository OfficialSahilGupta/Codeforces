import java.util.*;
public class SJF{
    static int solve(int[] bt){
        int time = 0;
        int wtTime = 0;

        Arrays.sort(bt);
        for(int i = 0; i < bt.length; i++){
            wtTime += time;
            time += bt[i];
        }

        return (wtTime/bt.length);
    }

    public static void main(String[] a){
        int[] bt = {4, 3, 7, 1, 2};
        System.out.println(solve(bt));
    }
}