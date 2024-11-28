import java.util.HashSet;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, -6, 1, 0};
        int missing = firstMissingPositive(nums);
        System.out.println(missing);
    }
}