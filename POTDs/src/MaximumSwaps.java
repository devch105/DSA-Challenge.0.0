public class MaximumSwaps {
    public static int maxSwap(int num) {
        char numArr[] = Integer.toString(num).toCharArray();
        int n = numArr.length;
        char maxElement = numArr[n-1];
        int maxIndex = n-1;
        int swapIdx1 = -1;
        int swapIdx2 = -1;
        for(int i=n-2;i>=0;i--){
            if(numArr[i] > maxElement){
                maxElement = numArr[i];
                maxIndex = i;
            }else if(numArr[i] < maxElement){
                swapIdx1 = i;
                swapIdx2 = maxIndex;
            }
        }

        //perform swapping
        if(swapIdx1!=-1){
            Swap(numArr,swapIdx1,swapIdx2);
        }
        return Integer.parseInt(new String(numArr));

    }


    public static void Swap( char arr[] , int b, int a){
        char t=arr[a];
        arr[2]=arr[b];
        arr[b]=t;
    }




    public static void main(String[] args) {

    int x=maxSwap(57843);
        System.out.println("--"+x);


    }
}
