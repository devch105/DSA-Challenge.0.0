package ArraysInJava.src;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
//        int arr[]=new int [5];
//        arr[0]=20;
//        arr[1]=10;
//        arr[2]=30;
//        arr[3]=40;
//        insert_Array(arr,1,0);
//        PrintArray(arr);
//  int x= Deletion(arr,3);
//  PrintArray(arr);

        Scanner sc=new Scanner(System.in);
//  // Multi _Dimensional Array
//         int Arr2D[][]=new int[3][2];
//         for(int i=0; i<Arr2D.length;i++){
//             for(int j=0; j<Arr2D[i].length; j++){
//                 System.out.print("Enter Element At index " +i+" ,"+j+" = ");
//                int element =sc.nextInt();
//                 Arr2D[i][j]=element;
//             }
//         }
//
//         Print2DArray(Arr2D);

        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Prompt user for number of columns
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Declare a 2D array
        int[][] array = new int[rows][cols];

        // Input elements into the 2D array
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter element at Index ["+i+"]["+j+"] = ");
                array[i][j]=scanner.nextInt();
            }
        }

        // Display the 2D array
        Print2DArray(array);
        Insertion2D(array,0,0,11);
        Print2DArray(array);
        Deletion2DArray(array,0,0);
        Print2DArray(array);



    }

    public static  void Print2DArray(int array[][]){
        System.out.println("The entered 2D array is:");
        for (int i = 0; i <array.length; i++) {
            System.out.print("Index "+i+" :");
            PrintArray(array[i]);
           System.out.println();
        }
    }

  // Insertion in Array
    public static void insert_Array(int arr[], int index,int num){
      if(index<0 || index>arr.length-1){
          System.out.println(" Index out of Bound");
          return;
      }
      int size = arr.length;
      // End shifting
        for(int i=size-2; i>=index; i--){
           arr[i+1]=arr[i];

        }
        arr[index]=num;
        System.out.println("Element :"+num+" Inserted");


    }
     // Insert 2D array

    public  static  void Insertion2D(int array[][],int pos1,int pos2,int num){
        insert_Array(array[pos1],pos2,num);
    }





    // Print Array
   public static void PrintArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
   }

   // Deletion in array
    public static void Deletion(int []arr,int index){
         if(index<0 || index>arr.length-1){
             System.out.println(" index out of bound ");
         }
         int temp=arr[index];
         for(int i=index; i<arr.length-2; i++){
             arr[i]=arr[i+1];

         }
         arr[arr.length-1]=0;
        System.out.println(" -> After Deletion ");

    }
// Deletion in 2D array

    public static void Deletion2DArray(int array[][], int pos1,int pos2){
        Deletion(array[pos1],pos2);
    }

}
