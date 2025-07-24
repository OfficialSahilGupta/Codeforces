import java.util.*;
public class PlusOneontheSubset{
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLong();
        }
        long max = getMax(arr);
        long min = getMin(arr);

        return (int) (max - min);


    }

    static long getMax(long[] arr){
        long max = Long.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static long getMin(long[] arr){
        long min = Long.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}