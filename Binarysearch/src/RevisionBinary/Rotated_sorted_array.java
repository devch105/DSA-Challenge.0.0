package RevisionBinary;

public class Rotated_sorted_array {
    public static void main(String[] args) {
      //  int arr[]={19,2,19,19,19,19};
       int arr[]={39 ,6 ,11, 14, 18, 36, 37, 38};
       // boolean res=searchduplicates(arr,target);
       // System.out.println(" Answer : "+res);
//        int x=MinElementinRotatedsortedArray(arr);
//
      //  int x=MinElementinDuplicated_RSA(arr);
        int x=Number_of_Rotation_RSA(arr);
        System.out.println(" Found : "+x);

    }
    public int search(int[] arr, int target) {
        int strt=0;
        int end=arr.length-1;
        int ans=-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(arr[mid]==target){
                return mid;
            }

            // Find left side sorted
            if(arr[strt]<=arr[mid]){
                // can answer be found?
                if(target>=arr[strt]&&target<arr[mid]){
                    end=mid-1;
                }
                else{
                    strt=mid+1;
                }

            }
            // check Right side
            else{
                if(target>arr[mid]&& target<=arr[end]){
                    strt=mid+1;
                }else{
                    end=mid-1;
                }

            }
        }
        return ans;
    }

    public static  boolean searchduplicates(int arr[],int target){
        int strt=0;
        int end=arr.length-1;
        boolean ans=false;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(arr[mid]==target){
                return true;
            }

            // if Start  , mid and end  are same duplicate Element
            if(arr[strt]==arr[mid] && arr[mid]==arr[end]){ // O(n)
                strt++;
                end--;
            }

            // Find left side sorted
            else if(arr[strt]<=arr[mid]){
                // can answer be found?
                if(target>=arr[strt]&&target<arr[mid]){
                    end=mid-1;
                }
                else{
                    strt=mid+1;
                }

            }
            // check Right side
            else{
                if(target>arr[mid]&& target<=arr[end]){
                    strt=mid+1;
                }else{
                    end=mid-1;
                }

            }
        }
        return ans;
    }


    public static   int MinElementinRotatedsortedArray(int arr[]){
        int strt=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            // Find left side sorted
            if(arr[strt]<=arr[mid]){
                // can answer be found?
                ans=Math.min(ans,arr[strt]);
                strt=mid+1;
            }
            // check Right side
            else{
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }
        }
        return ans;
    }

public static   int MinElementinDuplicated_RSA(int arr[]){
        int strt=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(strt<=end){
            int mid=strt+(end-strt)/2;

            // if Start  , mid and end  are same duplicate Element
            if(arr[strt]==arr[mid] && arr[mid]==arr[end]){ // O(n)
                strt++;
                end--;
            }
            // Find left side sorted
          else  if(arr[strt]<=arr[mid]){
                // can answer be found?
                ans=Math.min(ans,arr[strt]);
                strt=mid+1;
            }
            // check Right side
            else{
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }
        }
        return ans;
    }

    public static  int Number_of_Rotation_RSA1(int arr[]){
        int strt=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while (strt<=end){
            int mid=strt+(end-strt)/2;
            if(arr[strt]<=arr[mid]){
                ans=Math.min(ans,arr[strt]);
                index=strt;
                strt=mid+1;
            }else{
                ans=Math.min(ans,arr[mid]);
                index=mid;
                end=mid-1;
            }
        }
        return  index;
    }
    public static int Number_of_Rotation_RSA(int arr[]) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 for an empty array
        }

        int strt = 0;
        int end = arr.length - 1;

        // Handle case where array is not rotated
        if (arr[strt] < arr[end]) {
            return strt; // The first element is the smallest
        }

        while (strt <= end) {
            int mid = strt + (end - strt) / 2;

            // Check if mid is the minimum
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid; // Found the minimum
            }

            // Check if mid+1 is the minimum
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid + 1; // Found the minimum
            }

            // Decide which half to continue searching
            if (arr[mid] >= arr[strt]) {
                // Left half is sorted, so search in right half
                strt = mid + 1;
            } else {
                // Right half is sorted, so search in left half
                end = mid - 1;
            }
        }

        return -1; // This line should never be reached if input is valid
    }

}
