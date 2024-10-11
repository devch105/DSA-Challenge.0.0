package RevisionBinary;

import java.util.Arrays;
import java.util.Random;

public class InfiniteArray {
    // MINIMUM ABSOLUTE DIFFERENCE
    public static int FloorCielValue(int arr[] , int target ){
        int strt=0;
        int  end=arr.length-1;
        int FLvalue=-1;

        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(arr[mid]==target){
                FLvalue=arr[mid];
                break;
            } else if (arr[mid]<target) {
                strt=mid+1;
            }
            else {end=mid-1;
            }
        }
        // Element doesnot Exist
        int res=0;
        if(FLvalue==-1){
            if(end==-1){
                res=Math.abs(target-arr[strt]);

            } else if (strt==arr.length) {
                res=Math.abs((target-arr[end]));
            }
            else{
                int ans1=Math.abs(target-arr[strt]);
                int ans2=Math.abs(target-arr[end]);
                res=(ans1<ans2)?ans1:ans2;
            }
        }

        return res;
    }


    // Infinite binary search on a Array

    public  static int[] FindRangeofInfiniteArray(int arr[],int target){
        int Range[]=new int[2];
        int strt=0;
        int end=1;
        while(arr[end]< target){
            int temp=end;
            end=end*2;
            strt=temp;
        }
        Range[0]=strt;
        Range[1]=end;

return  Range;
    }





    public static void main(String[] args) {
       // int arr[]={2,4,8,12,13,17,19};
       // int target=90;
       // int x=  FloorCielValue(arr,target);
       // System.out.println(" M.abs ---- "+x);


        int[] array = new int[10000];
        Random rand = new Random();

        // Fill the array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);  // Generating random numbers between 0 and 999
        }

        // Sort the array
        Arrays.sort(array);
    }
}
