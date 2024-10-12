package RevisionBinary;

public class FindElementinMountainArray {

    public static int findPeakElement(int arr[]) {
        int strt = 0;
        int end = arr.length - 1;
        while (strt < end) {
            int mid = strt + (end - strt) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You're in the decreasing part of the mountain
                end = mid; // mid might be the peak, so move end to mid
            } else {
                // You're in the increasing part of the mountain
                strt = mid + 1; // mid+1 is definitely greater, so move start to mid+1
            }
        }
        // strt and end will converge to the peak index
        return strt;
    }

    public static int binarySearch(int[] arr, int target, int strt, int end, boolean isAsc) {
        while (strt <= end) {
            int mid = strt + (end - strt) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    strt = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    strt = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int findElementInMountainArray(int arr[], int target) {
        // Find the peak element index
        int peak = findPeakElement(arr);

        // Try to find the target in the first half (ascending part)
        int result = binarySearch(arr, target, 0, peak, true);
        if (result != -1) {
            return result;
        }

        // Try to find the target in the second half (descending part)
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;
        int x = findElementInMountainArray(arr, target);
        System.out.println("Element: " + target + " found at index = " + x);
    }
}
