//package leetcode;
//
//public class MedianofSortedArray {
//    public static void main(String[] args) {
//
//    }
//
//
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//   // make num 1 as Min length array
//        // call same function and change parameter becoz we want num1 to small
//        if(nums1.length>nums2.length){
//           return findMedianSortedArrays(nums2,nums1);
//        }//
//        // num 1 is smaller and num2 is greater
//        int n1=nums1.length;
//        int n2=nums2.length;
//        int start=0;
//        int end=n1;
//        while(start<=end){
//            // mid=cut1
//            int cut1=start+(end-start)/2;
//           // n1+n2 - length of cut1
//            int cut2=(n1+n2)-cut1;
//            // l1,l2,r1,r2;
//            int l1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
//            int l2=(cut2==0)?Integer.MAX_VALUE:nums2[cut2-1];
//        }
//    }
//}
