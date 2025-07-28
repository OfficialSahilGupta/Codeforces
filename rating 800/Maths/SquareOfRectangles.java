import java.util.*;

public class SquareOfRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l1 = sc.nextInt();
            int b1 = sc.nextInt();
            int l2 = sc.nextInt();
            int b2 = sc.nextInt();
            int l3 = sc.nextInt();
            int b3 = sc.nextInt();
            
            // Calculate the total area of all rectangles
            long totalArea = (long) l1 * b1 + (long) l2 * b2 + (long) l3 * b3;
            
            // For a square, side length = sqrt(totalArea)
            long sideLength = (long) Math.sqrt(totalArea);
            
            // Check if the total area forms a perfect square
            if (sideLength * sideLength != totalArea) {
                System.out.println("NO");
                continue;
            }
            
            // Check all possible arrangements
            boolean possible = checkArrangement(l1, b1, l2, b2, l3, b3, sideLength);
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
    
    // Function to check if rectangles can be arranged to form a square
    private static boolean checkArrangement(int l1, int b1, int l2, int b2, int l3, int b3, long side) {
        // Check if any dimension exceeds the square side
        if (l1 > side || b1 > side || l2 > side || b2 > side || l3 > side || b3 > side) {
            return false;
        }
        
        // Try all possible arrangements
        
        // Case 1: All three rectangles in a row
        if (l1 + l2 + l3 == side && b1 == side && b2 == side && b3 == side) {
            return true;
        }
        
        // Case 2: All three rectangles in a column
        if (b1 + b2 + b3 == side && l1 == side && l2 == side && l3 == side) {
            return true;
        }
        
        // Case 3: Two rectangles side by side, third below or above them
        // First two side by side, third below
        if (l1 + l2 == side && l3 == side && b1 == b2 && b1 + b3 == side) {
            return true;
        }
        
        // First and third side by side, second below
        if (l1 + l3 == side && l2 == side && b1 == b3 && b1 + b2 == side) {
            return true;
        }
        
        // Second and third side by side, first below
        if (l2 + l3 == side && l1 == side && b2 == b3 && b2 + b1 == side) {
            return true;
        }
        
        // Case 4: Two rectangles stacked, third beside them
        // First two stacked, third beside
        if (b1 + b2 == side && b3 == side && l1 == l2 && l1 + l3 == side) {
            return true;
        }
        
        // First and third stacked, second beside
        if (b1 + b3 == side && b2 == side && l1 == l3 && l1 + l2 == side) {
            return true;
        }
        
        // Second and third stacked, first beside
        if (b2 + b3 == side && b1 == side && l2 == l3 && l2 + l1 == side) {
            return true;
        }
        
        // Case 5: L-shaped arrangements
        // First rectangle forms the vertical part of L, second and third form horizontal part
        if (l1 == side && b1 + b2 == side && l2 + l3 == b1 && b2 == b3 && l2 * b2 + l3 * b3 == b1 * (side - l1)) {
            return true;
        }
        
        // Second rectangle forms the vertical part of L, first and third form horizontal part
        if (l2 == side && b2 + b1 == side && l1 + l3 == b2 && b1 == b3 && l1 * b1 + l3 * b3 == b2 * (side - l2)) {
            return true;
        }
        
        // Third rectangle forms the vertical part of L, first and second form horizontal part
        if (l3 == side && b3 + b1 == side && l1 + l2 == b3 && b1 == b2 && l1 * b1 + l2 * b2 == b3 * (side - l3)) {
            return true;
        }
        
        // First rectangle forms the horizontal part of L, second and third form vertical part
        if (b1 == side && l1 + l2 == side && b2 + b3 == l1 && l2 == l3 && b2 * l2 + b3 * l3 == l1 * (side - b1)) {
            return true;
        }
        
        // Second rectangle forms the horizontal part of L, first and third form vertical part
        if (b2 == side && l2 + l1 == side && b1 + b3 == l2 && l1 == l3 && b1 * l1 + b3 * l3 == l2 * (side - b2)) {
            return true;
        }
        
        // Third rectangle forms the horizontal part of L, first and second form vertical part
        if (b3 == side && l3 + l1 == side && b1 + b2 == l3 && l1 == l2 && b1 * l1 + b2 * l2 == l3 * (side - b3)) {
            return true;
        }
        
        // If none of the arrangements work
        return false;
    }
}

