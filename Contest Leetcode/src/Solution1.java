public class Solution1 {
    public int [] minElement(int[] nums) {

        for(int i=0; i<nums.length; i++){
            int x=nums[i];
            int replace=sumOfDigits(x);
            nums[i]=replace;
        }


        return  FindMin(nums);


    }

    public  int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


    public int [] FindMin(int nums[]){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
                index=i;
            }
        }
        int arr[]=new int[2];
        arr[0]=min;
        arr[1]=index;
        return arr;
    }



    public static void main(String[] args) {
        int[] array = {32,21,34,56,67};
        Solution1 sc=new Solution1();
        int x[]= sc.minElement(array);
        System.out.println("MINIMUM = "+x[0]+" Index= "+x[1]);
    }
}
