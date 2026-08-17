class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mn=nums1.length+nums2.length;
        double nums[]=new double[mn];
        for(int i=0;i<mn;i++){
            if(i<nums1.length){
                nums[i]=(double)nums1[i];
            }else{
                nums[i]=(double)nums2[i-nums1.length];
            }
        }
        Arrays.sort(nums);
        double median=0;
        if(mn%2!=0){
            int mid=mn/2;
            median=nums[mid];
            return median;
        }
        else{
            int mid=mn/2;
            // System.out.println(mid);
            // System.out.println(nums[mid]+" "+ nums[(mid-1)]);
            median=(nums[mid]+nums[mid-1])/2;
        }
        return median;
        
    }
}