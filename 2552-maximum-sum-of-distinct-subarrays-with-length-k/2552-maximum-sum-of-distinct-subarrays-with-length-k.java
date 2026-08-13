class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0;
        int i=0;
        int j=0;
        long s=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.containsKey(nums[j]) && map.get(nums[j])==1){
                s+=(long)nums[j];
            }
            if((j-i+1)==k){
                if(map.size()==k){
                    sum=Math.max(s,sum);
                }
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                    s=s-nums[i];
                }
                i++;
            }
            j++;
        }
        return sum;
    }
}