class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>set=new HashMap<>();
        int []arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(set.containsKey(diff)){
                arr[0]=i;
                arr[1]=set.get(diff);
                return arr;
            }
            set.put(nums[i],i);
        }
        return arr;
    }
}