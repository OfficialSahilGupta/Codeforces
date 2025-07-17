import java.util.*;
public class Kevin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];

            for(int i = 0; i<n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a, (x, y) -> (x % 2) - (y % 2) );

            long sum = 0;
            int points = 0;

            for(int x : a){
                sum += x;
                if(sum % 2 == 0){
                    points++;
                    while(sum % 2 == 0){
                        sum /= 2;
                    }
                }
            }

            System.out.println(points);
        }
    }
}