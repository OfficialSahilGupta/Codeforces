import java.util.*;

public class RecyclingCenterFinal {
    static Scanner sc = new Scanner(System.in);
    
    static int solve() {
        int n = sc.nextInt();
        long c = sc.nextLong();
        
        // Read the weights of trash bags
        long[] weights = new long[n];
        boolean[] destroyed = new boolean[n];
        int remaining = n;
        
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextLong();
        }
        
        int coins = 0;
        
        // Process bags until all are destroyed
        while (remaining > 0) {
            // Try to find a bag that can be destroyed for free
            int bestFreeIndex = -1;
            long bestFreeWeight = -1;
            
            for (int i = 0; i < n; i++) {
                if (!destroyed[i] && weights[i] <= c && weights[i] > bestFreeWeight) {
                    bestFreeIndex = i;
                    bestFreeWeight = weights[i];
                }
            }
            
            if (bestFreeIndex != -1) {
                // Destroy the heaviest free bag
                destroyed[bestFreeIndex] = true;
                remaining--;
            } else {
                // Find the lightest bag to destroy with a coin
                int minIndex = -1;
                long minWeight = Long.MAX_VALUE;
                
                for (int i = 0; i < n; i++) {
                    if (!destroyed[i] && weights[i] < minWeight) {
                        minIndex = i;
                        minWeight = weights[i];
                    }
                }
                
                // Pay a coin to destroy this bag
                destroyed[minIndex] = true;
                remaining--;
                coins++;
            }
            
            // Double the weight of all remaining bags
            for (int i = 0; i < n; i++) {
                if (!destroyed[i]) {
                    weights[i] *= 2;
                }
            }
        }
        
        return coins;
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            System.out.println(solve());
        }
        
        sc.close();
    }
}