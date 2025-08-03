import java.util.*;
public class RecyclingCenter {
    static Scanner sc = new Scanner(System.in);

    // Class to represent a trash bag with its weight
    static class Bag implements Comparable<Bag> {
        long weight;
        int stepsToExceedC; // Number of doublings needed to exceed threshold c
        
        Bag(long weight, long c) {
            this.weight = weight;
            this.stepsToExceedC = calculateSteps(weight, c);
        }
        
        // Calculate how many doublings are needed for this bag to exceed c
        private int calculateSteps(long weight, long c) {
            if (weight > c) return 0; // Already exceeds c
            
            int steps = 0;
            long w = weight;
            while (w <= c) {
                w *= 2;
                steps++;
            }
            return steps;
        }
        
        @Override
        public int compareTo(Bag other) {
            // Sort by steps to exceed c (ascending)
            return Integer.compare(this.stepsToExceedC, other.stepsToExceedC);
        }
    }
    
    static int solve() {
        int n = sc.nextInt();
        long c = sc.nextLong();
        
        // Read the weights of trash bags
        List<Bag> bags = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bags.add(new Bag(sc.nextLong(), c));
        }
        
        // Sort bags by steps needed to exceed c (ascending)
        Collections.sort(bags);
        
        int coins = 0;
        
        // Process bags one by one
        while (!bags.isEmpty()) {
            Bag currentBag = bags.remove(0); // Take the bag that will exceed c soonest
            
            if (currentBag.weight > c) {
                // Need to pay a coin to destroy this bag
                coins++;
            }
            
            // Double the weight of all remaining bags
            for (Bag bag : bags) {
                bag.weight *= 2;
            }
            
            // Re-sort the bags after doubling
            Collections.sort(bags, (b1, b2) -> {
                if (b1.weight <= c && b2.weight <= c) {
                    // Both bags can be destroyed for free, prioritize the one that will exceed c soonest
                    return Integer.compare(b1.stepsToExceedC, b2.stepsToExceedC);
                } else if (b1.weight <= c) {
                    // b1 can be destroyed for free, prioritize it
                    return -1;
                } else if (b2.weight <= c) {
                    // b2 can be destroyed for free, prioritize it
                    return 1;
                } else {
                    // Both bags exceed c, order doesn't matter for coin count
                    return 0;
                }
            });
        }
        
        return coins;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(solve());
        }
        sc.close();
    }
}