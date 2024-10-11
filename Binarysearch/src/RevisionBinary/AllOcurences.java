package RevisionBinary;

public class AllOcurences {

    public static int CountAllOccurence(int []arr, int target){
        int first=FirstandLastoccurence(arr,target,true);
        int Last=FirstandLastoccurence(arr,target,false);
                int count=Last-first+1;
                if(first==-1||Last==-1){
                    return -1;
                }
        return count;

    }
    public static  int FirstandLastoccurence(int Arr[], int Target,boolean FirstorLast){

        int strt=0;
        int end=Arr.length-1;
        int occur=-1;

        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(Arr[mid]==Target){
                occur=mid;
                if(FirstorLast){
                    end=mid-1;
                }
                else {
                    strt=mid+1;
                }
            } else if (Arr[mid]<Target) {
                strt=mid+1;
            }else {
                end=mid-1;
            }

        }
        return occur;

    }

    public static void main(String[] args) {
        int arr[]={2,2,3,4,4,4,5,6,7,9};
        int target=1;
        int Range =CountAllOccurence(arr,target);
        System.out.println(" Count off -1- ouccerence : "+Range);

    }
}
