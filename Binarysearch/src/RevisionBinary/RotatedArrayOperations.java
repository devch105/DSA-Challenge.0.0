package RevisionBinary;

public class RotatedArrayOperations {
       // clock wise sorted rotated array
       // (i). rotation count ->>  Index of Min element::
       //  Anti-Clock wise sorted rotated array
       // (i). Rotation count ->>  (N-i)%N

    public static   int MinElementinRotatedsortedArray(int arr[]){
        int strt=0;
        int end=arr.length-1;
        while(strt<end){
            int mid =strt+(end-strt)/2;
            // mid should >0 and mid> mid-1;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid;
            } else if (arr[mid]<arr[end]) {
                end=mid-1;
            }else {
                strt=mid=1;
            }
        }

        return  strt;
    }


    public static void main(String[] args) {

    }
}
