package practice;

public class Binary_rotation_array {

    public static void main(String[] args) {
  int arr[]={42,2,4,5,9,11};
  int index=FindMax(arr);
        System.out.println("-- "+arr[index]);

        int ind=Searchelement(arr,5);
        System.out.println("Element 5 index is : "+ind);
    }

    public int FindMin(int []arr){
        int strt=0;
        int end=arr.length-1;
        while(strt<end){
            int mid=strt+(end-strt)/2;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return  mid;
            } else if (arr[end]>arr[mid]) {
                end=mid-1;
            }
            else{
                strt=mid+1;
            }

        }
    return strt;
    }



    public  static  int FindMax(int []arr){
        int strt=0;
        int end=arr.length-1;
        while(strt<end){
            int mid=strt+(end-strt)/2;
            if(mid< arr.length-1 && arr[mid]>arr[mid+1]){
                return  mid;
            } else if (arr[strt]>arr[mid]) {
                end=mid-1;
            }
            else{
                strt=mid+1;
            }

        }
        return end;
    }



    public static int Searchelement(int arr [], int target){

        int strt=0;
        int end=arr.length-1;
        int ans=-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;

            if(arr[mid]==target){
                return mid;
            }
            // left sorrt
            if(arr[strt]<=arr[mid]){
                // can answer be found on left
                if(target>=arr[strt] && target<arr[mid]){
                    end=mid-1;
                }else{
                    strt=mid+1;
                }
            }
            else{// right side sorteed
                // can be found right
                if(target>=arr[mid] && target<arr[end]){
                    strt=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
        return ans;

    }
}
