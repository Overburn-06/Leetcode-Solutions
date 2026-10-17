class Solution {
    public int digit_sum(int num){
        int sum=0;
        while(num!=0){
            int n=num%10;
            sum+=n;
            num=num/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Integer nums_sorted[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            nums_sorted[i]=nums[i];
        }
        Arrays.sort(nums_sorted, (a, b) -> {
            int sum1 = digit_sum(a);
            int sum2 = digit_sum(b);
            if (sum1 != sum2) {
                return Integer.compare(sum1, sum2);
            }
            return Integer.compare(a, b);
        });
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int min_swap=0;
        for(int i=0;i<nums.length;i++){
            int expected_value=nums_sorted[i];
            int curr_value=nums[i];
            if(expected_value==curr_value)continue;
            int idx=map.get(expected_value);
            min_swap++;
            nums[i]=expected_value;
            nums[idx]=curr_value;
            map.put(curr_value,idx);
            map.put(expected_value,i);
        }
        return min_swap;
    }
}