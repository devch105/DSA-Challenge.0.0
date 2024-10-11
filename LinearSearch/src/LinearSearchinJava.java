import java.util.Random;
import java.util.Scanner;

public class LinearSearchinJava {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array length");
//        int size=sc.nextInt();
//        int Arr[]=new int [size];
//        Random rn=new Random();
//         // Fill random Number
//        System.out.println("Enter Random Bound :");
//        int bound=sc.nextInt();
//        for(int i=0; i<Arr.length; i++){
//            Arr[i]=rn.nextInt(bound);
//        }
//
//
//        PrrintArr(Arr);
////        System.out.println();
////        System.out.println(" Enter number to Search ");
////        int Target=sc.nextInt();
////        System.out.println();
////        System.out.print("First Occurence =");
////        LinearSearch(Arr,Target,false);
////        System.out.print("Last Occurence = ");
////        LinearSearch(Arr,Target,true);
////        LinearSearchMultiple(Arr,Target);
//        System.out.println();
//        Findmax(Arr);
//        Findmin(Arr);
        Scanner sc= new Scanner(System.in);
        int Arr2d[][]=Generate2DArr();
        Print2DArray(Arr2d);
        System.out.println(" Enter Target ");
        int Target=sc.nextInt();
        System.out.print(" First occurence : ");
        LinearSeach2d(Arr2d,Target,false);
        System.out.println();
        System.out.print(" Last Occurence : ");
        LinearSeach2d(Arr2d,Target,true);
        Multi_2DlinearSearch(Arr2d,Target);
        System.out.println();
        FindMaxSumSubArray(Arr2d);
        System.out.println();
        FindMinSumSubArray(Arr2d);

    }

    public static int [][]  Generate2DArr(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row=sc.nextInt();
        System.out.print("Enter cols : ");
        int cols=sc.nextInt();
        int Arr2d[][]=new int[row][cols];
        System.out.println(" Enter Bound");
        int Bound=sc.nextInt();
        Random rn= new Random();
        for(int i=0; i<row; i++){
            for (int j=0; j<cols; j++){
                Arr2d[i][j]=rn.nextInt(Bound);
            }
        }

        return Arr2d;
    }
    public static  void Print2DArray(int array[][]){
        System.out.println("The entered 2D array is:");
        for (int i = 0; i <array.length; i++) {
            System.out.print("Index "+i+" :");
            PrrintArr(array[i]);
            System.out.println();
        }
    }
    public static void LinearSearch(int [] Arr, int Target,boolean Lastoccurencce){
        int Ans=-1;
        for(int i=0; i<Arr.length; i++){
            if(Arr[i]==Target){
                Ans=i;
                if(Lastoccurencce==false){
                    break;
                }
            }
        }
        if(Ans==-1){
            System.out.println("Element not Found");
        }else{
            System.out.println("Element Found at Index : "+Ans);
        }

    }
    public static  void LinearSeach2d(int Arr[][],int Target,boolean Lastoccur){

        int outer=-1;
        int inner=-1;
        for(int i=0; i<Arr.length; i++){
            boolean found=false;
            for(int j=0; j<Arr[i].length; j++){
                if(Arr[i][j]==Target){
                    outer=i;
                    inner=j;
                    if(Lastoccur==false){
                        found=true;
                        break;
                    }
                }
            }
         if(found==true){
            break;
         }
        }
    if(outer!=-1){
        System.out.println("Element Found At Index : ["+outer+"] ["+inner+"] ");
    }else{
        System.out.println(" Element Not Found ");
    }
    }
    public static void Multi_2DlinearSearch(int arr[][], int Target){
        int size=0;
        for(int i=0; i<arr.length; i++){
            size=size+arr[i].length;
        }
        int ans[][]=new int [size][2];
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == Target) {
                    ans[k][0]=i;
                    ans[k][1]=j;
                    k++;
                }
            }
        }
        if(k!=0){
            for(int i=0; i<k; i++){
                System.out.println(" Index : ["+ans[i][0]+"]["+ans[i][1]+"]");
            }
        }else{
            System.out.println(" Element Not Found ");
        }

        System.out.println(" Multi "+ans.length);
    }
    public static void LinearSearchMultiple(int [] Arr, int Target){
        int k=0;
        int Multi[]=new int[Arr.length];
        for(int i=0; i<Arr.length; i++){
            if(Arr[i]==Target){
              Multi[k]=i;
              k++;
            }
        }
        int j=0;
     if(k!=0){
         System.out.println("Multiple Occurence of Item : "+Target);
         do{
             System.out.print(Multi[j]+" ");;
             j++;
         }while(Multi[j]!=0);
     }
     else{
         System.out.println("Element Not found ");
     }
    }
    public static void PrrintArr(int [] randomNumbers){
        //System.out.println("Random integers in the array:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }
    public static void Findmax(int Arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=1; i<Arr.length; i++){
            if(Arr[i]>max){
                max=Arr[i];
            }
        }
        System.out.println(" Max value : "+max);
    }
    public static void Findmin(int Arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=1; i<Arr.length; i++){
            if(Arr[i]<min){
                min=Arr[i];
            }
        }
        System.out.println(" Min value : "+min);
    }

    public static void FindMaxSumSubArray(int [][] arr){
        int Max=Integer.MIN_VALUE;
        int note_index =-1;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            if(sum>Max){
                Max=sum;
                note_index=i;
            }
        }
        System.out.println("Index "+note_index+" has Max Subarray Sum = "+Max);
    }

    public static void FindMinSumSubArray(int [][] arr){
        int Min=Integer.MAX_VALUE;
        int note_index =-1;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            if(sum<Min){
                Min=sum;
                note_index=i;
            }
        }
        System.out.println("Index "+note_index+" has Min Subarray Sum = "+Min);
    }


}
