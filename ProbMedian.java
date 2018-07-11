public class ProbMedian {
    public static void main(String[] args) {
        int[] nums1 ={1,3};
        int[] nums2 = {2};
        double ret =findMedianSortedArrays(nums1,nums2);
        System.out.println(ret);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median =0;
        int n = nums1.length;
        int m = nums2.length;
        int totLen = n+m;
        System.out.println(totLen);
        int[] nums = new int[totLen];
        for(int i=0;i<n;i++){
            nums[i] = nums1[i];
            System.out.println(i);
        }
        for(int i=0;i<m;i++){
        // System.out.println(i);
           nums[i+(n)] = nums2[i];
        }

        if(totLen%2==0){
            int temp = totLen/2;
            median =(nums[temp]+nums[temp+1])/2.0;
        }else if(totLen%2==1){
            int key = (totLen+1)/2;
            median = nums[key];
        }
        return median;
    }
}
