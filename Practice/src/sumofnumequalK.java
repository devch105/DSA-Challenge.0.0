public class sumofnumequalK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=9;
        System.out.println("checking = "+checksumequal(arr,k));


    }

    public static boolean checksumequal(int arr[],int k){
        int sum=0;
        for(int i=2; i<arr.length; i++){
            int cur=arr[i];
            int prev=arr[i-1];
            int prev1=arr[i-2];
            sum=cur+prev1+prev;
            if(sum==k){
                return  true;
            }
        }
        return  false;
    }
}
