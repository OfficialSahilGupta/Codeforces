import java.util.*;
public class VladCandies{
    static Scanner sc = new Scanner(System.in);
    static String ans(){
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLong();
        }

        if(n == 1){
            if(arr[0] > 1){
                return "NO";
            }
            else return "YES";
        } 


        Arrays.sort(arr);
        long max1 = arr[n - 1];
        long max2 = arr[n - 2];

        if(max1 > max2 + 1) return "NO";
        else return "YES";

    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}