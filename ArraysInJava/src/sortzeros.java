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
           if(arr[left]==1&&arr[right]==0){
               swap(arr,left,right);
               left++;
               right--;
            }
           if(arr[left]!=1){
               left++;
           }if(arr[right]!=0){
               right--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}