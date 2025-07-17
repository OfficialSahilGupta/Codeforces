import java.util.*;
public class ProblemGenerator{
    static Scanner sc = new Scanner(System.in);
    static int ans(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();

        int[] count = new int[7];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            count[c - 'A']++;
        }

        int missing = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] < m){
                missing += (m - count[i]);
            }
        }
        return missing;
    }
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}