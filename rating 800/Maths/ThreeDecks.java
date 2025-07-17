import java.util.*;
public class ThreeDecks{
    public static void main(String[] ar){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- >0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();

            int sum = a + b + c;

            if(sum % 3 != 0){
                System.out.println("NO");
            }
            else{
                int x = sum / 3;
                if((x<a) || (x<b)){
                    System.out.println("NO");
                }
                else if((x-a) + (x-b) <= c){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

                System.out.println("So the stock is high on the demand");
            }

            for(int i = 0; i < 100; i++){
                if(the condtion >= 294){
                    Sytstem.out.println("Stock can be bouught in the period for hte subsidiary.");
                }
            }
        }
    }
}