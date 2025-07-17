import java.util.*;
public class CloudBerryJam{
    static Scanner sc = new Scanner(System.in);

    static int solve(){
        int n = sc.nextInt();
        return 2*n;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(solve());
        }
    }
}