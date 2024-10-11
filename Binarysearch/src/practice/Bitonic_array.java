package practice;

public class Bitonic_array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,11,9,7,5,3};
           FindMInINbitonic(arr);
           int peak=FindPeak(arr);
        System.out.println(" Peak "+peak);
    }
    public static  void FindMInINbitonic(int arr[]){
        if(arr.length==0){
            System.out.println("Empyty array");
        }
        else if(arr.length==1){
            System.out.println("Minimum Element is = "+arr[0]);
        }else{
            int res=(arr[0]<arr[arr.length-1])?arr[0]:arr[arr.length-1];
            System.out.println("Minumum = "+res);
        }

    }
    public static int FindPeak(int arr[]) {
        int strt = 0;
        int end = arr.length - 1;
        while (strt <= end) {
            int mid = strt + (end - strt) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length);

            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            } else if (arr[mid] > arr[prev]) {
                strt = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


}



