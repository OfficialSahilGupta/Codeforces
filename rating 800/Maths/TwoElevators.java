import java.util.*;
public class TwoElevators{ 
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int time1 = Math.abs(a - 1);
        int time2 = Math.abs(b - c) + Math.abs(c - 1);

        if(time1 < time2) return 1;
        else if(time2 < time1) return 2;
        else return 3;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}