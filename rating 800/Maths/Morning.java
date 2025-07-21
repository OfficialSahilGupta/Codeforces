import java.util.*;
public class Morning {
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        String pin = sc.next();
        int sec = 0;
        int pos = 1;

        for(int i = 0; i < pin.length(); i++){
            char c = pin.charAt(i);
            int target = Character.getNumericValue(c);
            if(target == 0){
                target = 10;
            }
            int timeToMove = Math.abs(target - pos);
            sec += timeToMove + 1;
            pos = target;
        }

        return sec;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}


