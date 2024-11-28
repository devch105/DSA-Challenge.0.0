public class smallLargesum {

   public static int FindSecondOddEvenlargest(int arr[]){
       int largeeven=Integer.MIN_VALUE;
       int secondeven=Integer.MIN_VALUE;
       int largeodd=Integer.MIN_VALUE;
       int secondodd=Integer.MIN_VALUE;

       for(int i=0; i<arr.length; i++){
           if(i%2==0){
               if(arr[i]>largeeven){
                   secondeven=largeeven;
                   largeeven=arr[i];
               }else if(arr[i]>secondeven && arr[i]!=largeeven ){
                   secondeven=arr[i];
               }
           }
           else{
               if(arr[i]>largeodd){
                   secondodd=largeodd;
                   largeodd=arr[i];
               } else if (arr[i]>secondodd && arr[i]!=largeodd) {
                   secondodd=arr[i];
               }
           }
       }
       System.out.println(" -> "+secondodd+" -> "+secondeven);
       return secondeven+secondodd;

   }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,9};
        System.out.println(" find Answer :"+FindSecondOddEvenlargest(arr));
    }
}
