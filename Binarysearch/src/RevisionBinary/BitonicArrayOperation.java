package RevisionBinary;

public class BitonicArrayOperation {
// Validate
   public static boolean validateBitonicArray(int arr[]){
       int index=0;
       int n=arr.length;
       // Find peak
       while(index<n-1){
           if(arr[index]<arr[index+1]){
               index++;
           }else {
               break;
           }
           if(index==0 || index==n-1){
               return  false;
           }
       }
       while (index<n-1) {
           if (arr[index] > arr[index + 1]) {

               index++;
           } else {
               break;
           }
       }
       if(index==n-1){
           return true;
       }else return false;
   }
// Find Peak
    public  static  int FindPeak(int arr[]){
       int strt=0;
       int end=arr.length-1;
       while (strt<=end){
           int mid=strt+(end-strt)/2;
           if(mid!=0 && mid!= arr.length-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
               return arr[mid];
           }
           else if( mid!=0 && arr[mid]<arr[mid+1]){
               strt=mid=1;
           }
           else{end=mid-1;
       }

      }
   return -1;
   }

    public static void main(String[] args) {
        int arr[]={2,4,6,7,9,15,24,11,8,5,3,1};
        int peak=FindPeak(arr);
        System.out.println("-------: "+peak);
    }
   }
