import java.util.*;
public class  Elections{
    static Scanner sc = new Scanner(System.in);
    static void ans(){
        long[] arr = new long[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLong();
        }

        long max = getMax(arr);
        int count = countMax(arr, max);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max && count == 1){
                System.out.print("0 ");
            }
            else{
                System.out.print((max - arr[i] + 1) + " ");
            }
        }

    }

    static long getMax(long[] arr){
        return Math.max(arr[0], Math.max(arr[1], arr[2]));
    }

    static int countMax(long[] arr, long max){
        int count = 0;
        for(long x : arr){
            if(x == max){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            ans();
        }
    }
}