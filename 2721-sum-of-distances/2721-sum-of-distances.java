class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }else{
                map.get(nums[i]).add(i);
            }
        }
            long[]res=new long[nums.length];

            for(List<Integer>list:map.values()){
                int n=list.size();
                long[]prefix=new long[n];
                if(n<=1){
                    res[list.get(0)]=0;
                    continue;
                }
                long total=0;
                for(int i=0;i<list.size();i++){
                    total+=list.get(i);
                    prefix[i]=total;
                }
                for(int i=0;i<n;i++){
                    long left_sum=0;
                    if(i!=0){
                        left_sum=prefix[i-1];
                    }
                    long right_sum=total-prefix[i];
                    long left_dist=(long)list.get(i)*i-left_sum;
                    long right_dist=right_sum-(long)list.get(i)*(n-i-1);
                    res[list.get(i)]=left_dist+right_dist;
                }
            }
            return res;
        
    }
}