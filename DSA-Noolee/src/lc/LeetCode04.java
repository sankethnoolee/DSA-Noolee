package lc;

public class LeetCode04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int nums3[]=new int[nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                i++;
            }else{
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            nums3[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            nums3[k]=nums2[j];
            j++;
            k++;
        }
        int median=0;
        int middle=(nums3.length-1)/2;
        if(nums3.length%2==0){
            return (nums3[middle]+nums3[middle+1])/2.0;
        }else{
            return nums3[middle];
        }
    }
}
