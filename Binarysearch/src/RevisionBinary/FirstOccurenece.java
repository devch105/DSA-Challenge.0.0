package RevisionBinary;

public class FirstOccurenece {


    public static  int Firstoccurence(int Arr[], int Target){

        int strt=0;
        int end=Arr.length-1;
        int occur=-1;
        boolean FirstorLast=true;
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
        int arr[]={2,2,4,4,8,12,13};
        int target=4;
        int x=Firstoccurence(arr,target);
        if(x==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println(" First occurenece at : "+x);
        }
    }

}
