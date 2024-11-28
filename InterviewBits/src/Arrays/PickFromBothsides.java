package Arrays;

import java.util.ArrayList;

public class PickFromBothsides {
    public static int solve(ArrayList<Integer> A, int B) {
        int currentsum = 0;
        int Maxsum = Integer.MIN_VALUE;

        // Calculate initial sum of the first B elements
        for (int i = 0; i < B; i++) {
            currentsum += A.get(i);
        }

        Maxsum = currentsum; // Initialize Maxsum with the first B elements' sum

        // Now we will try to replace elements from the end with those from the front
        for (int i = 0; i < B; i++) {
            currentsum -= A.get(B - 1 - i); // Remove element from the end
            currentsum += A.get(A.size() - 1 - i); // Add element from the end

            Maxsum = Math.max(Maxsum, currentsum); // Update Maxsum if current is greater
        }

        return Maxsum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(-2);
        A.add(3);
        A.add(1);
        A.add(2);

        int B = 3;
        System.out.println("Answer: " + solve(A, B));
    }
}