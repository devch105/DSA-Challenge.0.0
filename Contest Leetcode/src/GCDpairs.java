import java.util.*;

public class GCDpairs {

    // Function to compute the GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to compute the GCD pairs and answer the queries
    public  int[] gcdPairspart(int[] nums, int[] queries) {
        List<Integer> gcdl1 = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                gcdl1.add(gcd(nums[i], nums[j]));
            }
        }


        Collections.sort(gcdl1);


        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] = gcdl1.get(queries[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 3, 4};
        int[] queries = {0, 2, 2};

        // Get the result of the queries
        int[] result = gcdPairspart(nums, queries);

        // Output the result
        System.out.println(Arrays.toString(result));  // Output: [1, 2, 2]
    }
}
