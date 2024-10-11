package practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Binarysearch {
    // Main 1
    // Another Main Method Here
    //    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        System.out.print(" Enter Array length ");
////        int size=sc.nextInt();
////        int Arr[]=new int [size];
////        Random rn=new Random();
////        System.out.println(" Enter Bound :");
////        int bound= sc.nextInt();
////        for(int i=0; i<Arr.length; i++){
////            Arr[i]= rn.nextInt(bound);
////        }
////        Arrays.sort(Arr);
////        PrrintArr(Arr);
////        System.out.println();
////        System.out.println(" Enter Target to find : ");
////        int target=sc.nextInt();
////        Binary_searchInc(Arr,target);
////       // int arr2[]={2,2,3,4,4,4,6,8,9};
////      //  Binary_search_Dec(arr2,5);
////
////        Bin_first_occurence(Arr,target);
////        Bin_last_occurence(Arr,target);
//
//    }

    // Main 2
    public static void main(String[] args){
    int arr[] = {4, 15, 16, 23, 34,42};
    int target =44;
//    int first=Binary_search_range(arr,target,true);
//    int last=Binary_search_range(arr,target,false);
//      if(first==-1){
//          System.out.println(" Element not found");
//      }else {
//          System.out.println(" Occurence of target : " + (last - first + 1));
//      }
        int floor=BinaryFloor(arr,44);
        System.out.println(" Floor value : "+floor);
        int Ceil=BinaryCieling(arr,44);
        System.out.println(" Ceiling value : "+Ceil);




}
public static int BinaryFloor(int arr[], int Target){
    int result=-1;
    int first=0;
    int last=arr.length-1;
    while (first<=last){

        int mid= first + (last-first)/2;
        if(arr[mid]==Target){
            result=arr[mid];
            break;
        }
        else if(arr[mid]<Target){
            first=mid+1;
            result=arr[mid];
        }
        else {last=mid-1;}
    }
return result;

}
    public static int BinaryCieling(int arr[], int Target){
        int result=-1;
        int first=0;
        int last=arr.length-1;
        while (first<=last){

            int mid= first + (last-first)/2;
            if(arr[mid]==Target){
                result=arr[mid];
                break;
            }
            else if(arr[mid]<Target){
                first=mid+1;

            }
            else {last=mid-1;
                result=arr[mid];}
        }
        return result;

    }












public static  int Binary_search_range( int  arr[], int Target, boolean isFirst){

    int result=-1;
    int first=0;
    int last=arr.length-1;
    while (first<=last){

        int mid= first + (last-first)/2;
        if(arr[mid]==Target){
            result=mid;
            if(isFirst){
                last=mid-1;
            }else {
                first=mid+1;
            }
        }
        else if(arr[mid]<Target){first=mid+1;}
        else {last=mid-1;}
    }
        return  result;
    }





















    public static void PrrintArr(int [] randomNumbers){
        //System.out.println("Random integers in the array:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }
    public static  void Binary_searchInc(int arr[],int Target){
        int result=-1;
        int first=0;
        int last=arr.length-1;
      while (first<=last){

          int mid= first + (last-first)/2;
          if(arr[mid]==Target){result=mid;
              System.out.println("Print Mid : "+result);
              break;}
          else if(arr[mid]<Target){first=mid+1;}
          else {last=mid-1;}
      }
      if(result!=-1){
          System.out.println(" Element : "+Target+" found at Index : "+result);
      }else {
          System.out.println("Element not found");
      }
    }

    public  static  void  Bin_first_occurence(int arr[],int Target){
        int result=-1;
        int first=0;
        int last=arr.length-1;
        boolean isFirst=true;
        while (first<=last){

            int mid= first + (last-first)/2;
            if(arr[mid]==Target){
                result=mid;
                System.out.println("Print Mid : "+result);
                if(isFirst){
                    last=mid-1;
                }else {
                    first=mid+1;
                }
            }
            else if(arr[mid]<Target){first=mid+1;}
            else {last=mid-1;}
        }
        if(result==-1){
            System.out.println("Element not found");
        }else {
            System.out.print(" First Occurence :");

            System.out.println(" Element : "+Target+" found at Index : "+result);

        }
    }

    public static  void Bin_last_occurence(int arr[], int Target) {
        int result = -1;
        int first = 0;
        int last = arr.length - 1;
        boolean isFirst = false;
        while (first <= last) {

            int mid = first + (last - first) / 2;
            if (arr[mid] == Target) {
                result = mid;
                System.out.println("Print Mid : "+result);

                if (isFirst) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } else if (arr[mid] < Target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.print(" Last Occurence :");

            System.out.println(" Element : " + Target + " found at Index : " + result);

        }
    }

    public static  void Binary_search_Dec(int arr[],int Target){
        int result=-1;
        int first=0;
        int last=arr.length-1;
        while (first<=last){

            int mid= first + (last-first)/2;
            if(arr[mid]==Target){result=mid; break;}
            else if(arr[mid]<Target){ last=mid-1;}
            else {first=mid+1;}
        }
        if(result!=-1){
            System.out.println(" Element : "+Target+" found at Index : "+result);
        }else {
            System.out.println("Element not found");
        }
    }


}
