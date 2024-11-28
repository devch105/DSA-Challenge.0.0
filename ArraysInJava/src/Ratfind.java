public class Ratfind {

    public static int findnoofHouses(int arr[],int R,int U){
        if(arr==null){
            return -1;
        }
        int result=0;
        int foodsum=0;
        int reqfood=R*U;

        for(int i=0; i<arr.length; i++){
            foodsum+=arr[i];
          if(foodsum>reqfood){
              result=i+1;
              break;
          }
        }
        if(result==0){
            return 0;
        }else {
            return result;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,8,3,5,7,4,1,2};
        int r=7;
        int unit=2;
        System.out.println(" Answer : "+findnoofHouses(arr,r,unit));
    }
}
