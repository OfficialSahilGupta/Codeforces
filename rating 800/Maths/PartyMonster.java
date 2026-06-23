import java.util.*;

public class PartyMonster {
    static void solve(int n, String s){
        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '(') open++;
        }
        int close = n - open;

        System.out.println(open == close ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            solve(n, s);
        }

    }
}