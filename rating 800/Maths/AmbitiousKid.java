import java.util.*;
public class AmbitiousKid{
    static Scanner sc = new Scanner(System.in);
    static int ans(){
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int operations = 0;

        int minElement = findmin(nums);
        while(minElement != 0){
            minElement--;
            operations++;
        }

        return Math.abs(operations);
    }

    static int findmin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(Math.abs(nums[i]) < min){
                min = Math.abs(nums[i]);
            }
        }

        return min;
    }


    public static void main(String[] a){

        System.out.println(ans());

    }
}