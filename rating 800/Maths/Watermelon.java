import java.util.*;
public class Watermelon{
    static Scanner sc = new Scanner(System.in);

    static String ans(){
        int n = sc.nextInt();
        if(n % 2 == 0 && n > 2 && n!= 2){
            return "YES";
        }
        else return "NO";
    }

    public static void main(String[] a){
        System.out.println(ans());
    }
}