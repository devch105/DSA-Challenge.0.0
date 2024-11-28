public class smallestsubarraywithsum {
    public static int smallestsubarraywithgivensum(int arr[], int S){
        int minLen=Integer.MAX_VALUE;
        int strt=0;
        int sum=0;
        for(int size=0; size<arr.length; size++){
            sum+=arr[size];
            while(sum>=S){
                minLen=Math.min(minLen,size-strt+1);
                sum-=arr[strt];
                strt++;
            }
        }

        return minLen==Integer.MAX_VALUE ? 0:minLen;

    }



    public static void main(String[] args) {
        int arr[]={2,1,1,1,3,4,7};
        int S=4;
        System.out.println(" Answer : "+smallestsubarraywithgivensum(arr,S));
    }
}
