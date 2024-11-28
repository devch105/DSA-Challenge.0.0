import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateAnArray {


    public  static  void RotatebyK(int arr[],int k){
          int n=arr.length;
          if(k>n){
              System.out.println("Index out of bound");
          }
          // 1. Reverse Entire array

           reverse(arr,0,n-1);

          //2. Reverse k Element
          reverse(arr,0,k-1);

          //3.  Reverse left element
         reverse(arr,k,n-1);
    }
    public static void reverse(int arr[],int strt,int end){
        while(strt<end){
            int temp=arr[strt];
            arr[strt]=arr[end];
            arr[end]=temp;
         strt++;
         end--;
        }
    }



    public static void main(String[] args) {
     int arr[]={1,3 ,6 ,11 ,12 ,17};
     int k=4;
        System.out.println(" Array before Rotation "+ Arrays.toString(arr));

     RotatebyK(arr,k);

        System.out.println(" Array after Rotation "+ Arrays.toString(arr));


    }

//    public static void rotate(ArrayList<Integer> arr, int k) {
//        int n = arr.size();
//        k = k % n; // Handle cases where k >= n
//
//        // Step 1: Reverse the entire array
//        reverse(arr, 0, n - 1);
//
//        // Step 2: Reverse the first k elements
//        reverse(arr, 0, k - 1);
//
//        // Step 3: Reverse the last n-k elements
//        reverse(arr, k, n - 1);
//    }
//
//    private static void reverse(ArrayList<Integer> arr, int start, int end) {
//        while (start < end) {
//            int temp = arr.get(start);
//            arr.set(start, arr.get(end));
//            arr.set(end, temp);
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//
//        rotate(arr, 1); // Rotate by 2 positions
//
//        for (int num : arr) {
//            System.out.print(num + " "); // Output: 4 5 1 2 3
//        }
//    }
}
