public class sortIntegers {
    public static void main(String[] args) {
      int arr[]={12,30,-23,34,-45,67,-59};
      printarray(arr);
        System.out.println();
        System.out.println("-------------------------------------------------");
      System.out.println(" Order can be changed : ");
      sortinteger(arr);
        System.out.println();
        System.out.println("--------------------------------------------------");
      printarray(arr);
        System.out.println();
        System.out.println(" Order cannot be changed : ");
        sortIntegerByorder(arr);
        printarray(arr);
    }
    public static void sortIntegerByorder(int arr[]) {

        }




    public  static  void sortinteger(int arr[]){
        int lft=0;
        int ryt=arr.length-1;
        while(lft<ryt){
            if(arr[lft]>0 && arr[ryt]<0){
                swap(arr,lft,ryt);
                lft++;
                ryt--;
            }
            if(arr[lft]<0){
                lft++;
            }
            if(arr[ryt]>0){
                ryt--;
            }

        }
    }
















    // swap function
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // print array function
    public  static  void  printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
