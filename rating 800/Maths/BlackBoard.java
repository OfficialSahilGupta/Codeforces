import java.util.*;
public class BlackBoard{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(optimalPlay());
        }
    }

    static String optimalPlay(){
        int n = sc.nextInt();

        if(n % 4 == 0){
            return "BOB";
        }
        else return "ALICE";
    }
}