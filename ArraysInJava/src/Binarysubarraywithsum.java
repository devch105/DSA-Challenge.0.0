public class Binarysubarraywithsum {

    public static int numSubarraysWithSum(int[] arr, int goal) {
          int sum=0;
          int count=0;
          int strt=0;
          for(int end=0; end<arr.length; end++){
              sum=sum+arr[end];
              if(sum==goal){
                  count++;
              }
              if(sum>goal){
                  break;
              }
              sum=0;
          }
          return count;
    }



    public static void main(String[] args) {
       int arr[]= {1,1,0,1};
       int goal = 2;
        System.out.println(" Answer : "+numSubarraysWithSum(arr,goal));

    }
}
