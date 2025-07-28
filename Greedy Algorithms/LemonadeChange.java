import java.util.*;
public class LemonadeChange{
    public static void main(String[] a){
        int[] arr = {5, 5, 5, 10, 20};
        System.out.println(ans(arr));
    }

    static boolean ans(int[] arr){
        int five = 0;
        int ten = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                five++;
            }
            else if(arr[i] == 10){
                if(five >= 1){
                    ten++;
                    five--;
                }
                else return false;
            }
            else{
                if(ten >= 1 && five >= 1){
                    ten--;
                    five--;
                }

                else if(five >= 3){
                    five -= 3;
                }
                else return false;
            }
        }

        return true;
    }
}