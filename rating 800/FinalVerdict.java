import java.util.*;
public class FinalVerdict{
    static Scanner sc = new Scanner(System.in);
    static String ans(){
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += sc.nextInt();
        }

        if(sum % n == 0 && sum / n == x){
            return "YES";
        }
        else return "NO";

    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}