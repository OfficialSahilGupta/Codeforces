import java.util.*;
public class LetterHome{
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int rightMost = arr[n - 1];
        int leftMost = arr[0];

        if(s >= leftMost && s <= rightMost){
            return (rightMost - leftMost) + Math.min(Math.abs(s - leftMost) , Math.abs(rightMost - s));
        }

        else if(s < leftMost){
            return rightMost - s;
        }

        else return s - leftMost;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}
