import java.util.*;
import java.io.*;

public class SpyDetectd{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(parts[i]);
            }

            if(arr[0] == arr[1]){
                // spy is at another index
                for(int i = 2; i < arr.length; i++){
                    if(arr[i] != arr[0]){
                        System.out.println(i + 1);
                        break;
                    }
                }
            }

            else{
                if(arr[0] == arr[2]){
                    System.out.println(2);
                }
                else{
                    System.out.println(1);
                }
            }
        }
    }
}