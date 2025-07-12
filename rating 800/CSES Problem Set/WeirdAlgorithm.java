import java.util.*;
public class WeirdAlgorithm{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n > 0){
            if(n == 1) break;
            if(n % 2 == 0){
                n /= 2;
            }
            else n = n * 3 + 1;
            
            System.out.println(n);
        }
    }
    
}