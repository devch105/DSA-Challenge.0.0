public class sortzeros {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1, 1, 1, 0, 1, 0};
        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer to the right until 1 is found
            if(arr[left] == 0 && left < right) {
                left++;
            }

            // Move right pointer to the left until 0 is found
            if (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap if left is less than right
             if(left < right) {
                swap(arr,left,right);
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}