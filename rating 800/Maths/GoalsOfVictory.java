import java.util.*;
public class GoalsOfVictory{
    static Scanner  sc = new Scanner(System.in);
    static int ans(){
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n - 1; i++){
            sum += sc.nextInt();
        }
        return -sum;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}