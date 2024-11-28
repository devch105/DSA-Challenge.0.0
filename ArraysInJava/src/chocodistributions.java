import java.lang.reflect.Array;

public class chocodistributions {
    public static int  find_difference(int arr[], int M){
        if(M==0 || arr.length==0){
            return -0;
        }
        quicksort(arr,0,arr.length-1);
        if (arr.length < M) return -1;
        int min_diff = Integer.MAX_VALUE;


        for (int i = 0; i + M - 1 < arr.length-1; i++) {
            int diff = arr[i + M - 1] - arr[i];
            if (diff < min_diff) min_diff = diff;
        }

        return min_diff;

    }
// sort function is this :
    // partition find karo :
   public  static int partition(int arr[], int low, int high) {
        int pvt = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (arr[j] <= pvt) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

   // quicksort
    static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }



    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        System.out.println(" Answer : "+find_difference(arr,m));
    }
}
