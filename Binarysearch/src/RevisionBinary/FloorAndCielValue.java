package RevisionBinary;
import java.util.Scanner;

public class FloorAndCielValue {

    public static int FloorCielValue(int arr[] , int target, boolean floororCiel ){
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
                if(floororCiel){

                    FLvalue=arr[mid];
                }
            }
            else {end=mid-1;
                  if(!floororCiel){

                      FLvalue=arr[mid];
                  }
            }
        }
        return FLvalue;
    }


    public static void main(String[] args) {
        int arr[]={3,6,7,9};
        System.out.println(" Enter Number to check Floor and Ciel values : ");
        Scanner sc=new Scanner(System.in);
        int Target= sc.nextInt();
        int x=FloorCielValue(arr,Target,true);
        System.out.println("Floor--------"+x);
        int y=FloorCielValue(arr,Target,false);
        System.out.println("Ciel ---------"+y);
    }
}
