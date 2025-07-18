import java.util.*;
public class TreasureChest{
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = sc.nextInt();

        int carryTime = Math.abs(x - y);
        int option1 = Integer.MAX_VALUE;
        int option2 = Integer.MAX_VALUE;
        int option3;

        int ansFinal;

        if(carryTime <= k){
            option1 = Math.abs(x) + carryTime;
        }

        option2 = Math.abs(y) + carryTime;

        int carryPosition = x + (x < y ? k : -k);
        option3 = Math.abs(x) + k + Math.abs(carryPosition - y ) * 2;

        return Math.min(option1, Math.min(option2, option3));

    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}