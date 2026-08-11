class Solution {
    public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int target_sum=sum-x;
        if(target_sum==0) return nums.length;
        int count =Integer.MIN_VALUE;
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int diff=sum-target_sum;
            if(map.containsKey(diff)){
                count=Math.max(count,i-map.get(diff));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        if(count==Integer.MIN_VALUE) return -1;
        return nums.length-count;
    }
}  