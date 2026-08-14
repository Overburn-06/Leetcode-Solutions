class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int odd_count=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]%2!=0)odd_count++;
            int diff=odd_count-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(odd_count,map.getOrDefault(odd_count,0)+1);
            right++;
        }
        return count;
    }
}