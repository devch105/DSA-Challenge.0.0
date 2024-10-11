package practice;

public class KokoEating {

    public static void main(String[] args) {
        int piles[]={3,6,7,11};
        int hour=8;
        int answer=4;
        int result=koko(piles,hour);
        System.out.println(answer+" ------ "+result);


    }
    public static int koko(int arr[], int hour){
        int strt=1;
        int end=FindMax(arr); // Find Largest in Array
        int ans=-1;
       while(strt<=end){
           int mid= strt+(end-strt)/2;
           if(isEatingspeedValid(arr,mid,hour)){
               ans=mid;
               end=mid-1;
           }else {
               strt=mid+1;
           }


       }
return  ans;
    }

    private static boolean isEatingspeedValid(int[] arr, int eatspeed, int hour) {

       int hoursspent=0;
        for(int i=0;i<arr.length; i++){
            hoursspent+=arr[i]/eatspeed;
            if(arr[i]%eatspeed!=0){
                hoursspent+=1;
            }
            if(hoursspent>hour){
                return  false;
            }
        }
        return true;
    }

    public static int FindMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
    }



}
