public class ReverseArray {
    public static void main(String[] args) {

        int arr[]={2,3,4,56,45,7,77,6,45,5,44,4,};
       ReverseArr(arr);

       for(int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
       }

    }
    public static  void ReverseArr(int arr[]){
        int start=0;
        int end=arr.length-1;
        int prr[]={2,3,4,56,45,7,77,6,45,5,44,4,};
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
