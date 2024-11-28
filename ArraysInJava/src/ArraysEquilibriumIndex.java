public class ArraysEquilibriumIndex {
    public static int equilibrium(int arr[], int n) {
        int totalSum = 0;
        // Calculate total sum of the array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        // Iterate through the array to find the equilibrium index
        for (int i = 0; i < n; i++) {
            // Right sum is totalSum - leftSum - arr[i]
            int rightSum = totalSum - leftSum - arr[i];
            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i; // Return equilibrium index
            }
            // Update left sum for next iteration
            leftSum += arr[i];
        }
        return -1; // Return -1 if no equilibrium index is found
    }



    public static void main(String[] args) {
        int arr[]={1,5,6,6,7,4,1};
        System.out.println(" Array Equilibrium : "+equilibrium(arr,arr.length));

    }
}
