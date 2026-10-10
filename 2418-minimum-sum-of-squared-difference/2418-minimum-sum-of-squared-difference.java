
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int []freq=new int[100001];
        for(int i=0;i<nums1.length;i++){
            int d=Math.abs(nums1[i]-nums2[i]);
            if(d!=0){
                freq[d]=freq[d]+1;
            }
        }
        long k=(long)k1+(long)k2;
        for(int curr_diff=100000;curr_diff>0 && k>0;curr_diff--){
            int count=Math.min(freq[curr_diff],(int)k);
            freq[curr_diff]-=count;
            freq[curr_diff-1]+=count;
            k-=count;
        }
        long sum=0;
        for(long i=0;i<freq.length;i++){
           sum+=(i*i)*freq[(int)i];
        }
        return sum;
    }
}