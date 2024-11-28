import java.util.HashSet;

public class MaximumSubArray {

    public  static long maximumSubarraySum(int[] arr, int k) {
       int Maxsum=0; // Holds MaxsubArraysum
        int sum=0;   // holds temporary sum;
        int strt=0;  // first index;
        for(int end=0; end<arr.length; end++){
            sum+=arr[end];
            if(end>=k-1){
                Maxsum=Math.max(sum,Maxsum);

                sum-=arr[strt];
                strt++;
            }
        }
        return Maxsum;
    }

    public static long minimumsubarrayDistinct(int arr[],int k){
        long Maxsum=0; // Holds MaxsubArraysum
        long sum=0;   // holds temporary sum;
        int strt=0;  // first index;
        HashSet<Integer> hs = new HashSet<>();
        int end=0;
        while(end<arr.length){
            int temp=arr[end];
            while(hs.contains(temp)){
                hs.remove(arr[strt]);
                sum-=arr[strt];
                strt++;
            }
            sum+=temp;


            if((end-strt+1)==k){
                Maxsum=Math.max(sum,Maxsum);

                sum-=arr[strt];
                hs.remove(arr[strt]);
                strt++;
            }
            hs.add(temp);
            end++;

        }
        return Maxsum;
    }


    public static void main(String[] args) {


        int arr[]={1,5,4,5,9,8,9};
        int k=3;
        System.out.println(" Answer "+maximumSubarraySum(arr,k));
        System.out.println(" Answer Distinct : "+minimumsubarrayDistinct(arr,k));

    }
}
