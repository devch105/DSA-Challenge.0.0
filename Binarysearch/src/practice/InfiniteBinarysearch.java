package practice;

public class InfiniteBinarysearch {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,17,19};

    }

    public int Binary_Absolute_sum(int arr[], int target){
        int result=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
